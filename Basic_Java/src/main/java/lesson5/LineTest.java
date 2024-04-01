package lesson5;

import javax.sound.sampled.Line;

class Point2D_2{
    private double x;
    private double y;
    Point2D_2(double xVal, double yVal){
        x= xVal;
        y= yVal;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void details(){
        System.out.println("("+x+","+y+")");
    }
}
class Line2D{
    private Point2D_2 first;
    private Point2D_2 second;
    public Line2D(Point2D_2 p1, Point2D_2 p2 ){
        first =p1;
        second =p2;
    }
    public void details(){
        System.out.println("(("+first.getX()+","+first.getX()+"),("+second.getY()+","+second.getY()+"))");
    }
    public boolean isParallel (Line2D otherLine){
        //add your line
        double thisDelta = (first.getY() - second.getY()) / (first.getX()) - second.getX();
        double otherDelta = (otherLine.first.getY()- otherLine.second.getY())/(otherLine.first.getX()-otherLine.second.getX());
        return ( thisDelta == otherDelta);
    }
    public double length(){
        //add your line here
        return Math.sqrt(Math.pow(first.getX()-second.getX(),2) + Math.pow(first.getY() - second.getY(),2));
    }
}
public class LineTest {
    public static void main(String[] args) {
        Line2D line1, line2;
        line1 = new Line2D(new Point2D_2(10,20),new Point2D_2(5,15));
        line2 = new Line2D(new Point2D_2(4,4), new Point2D_2(33,22));
        System.out.println(" The length of line 1 is: " + line1.length());
        System.out.println("The length of line 2 is: " + line2.length());
        if( line1.isParallel(line2)){
            System.out.println(" Line 1 is parallel to line 2");
        }
        else {
            System.out.println(" line 1 is not parallel to line 2");
        }
    }
}
