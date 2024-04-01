package lesson5;

public class Point2D {
    private float x,y;
    public Point2D(){
        this.x =0;
        this.y =0;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void move(float dx, float dy){
        x += dx;
        y +=dy;
    }
    public double distance(Point2D A){
        return Math.sqrt(Math.pow(this.x- A.x,2)) + Math.pow(this.y- A.y,2);
    }
    public void display(){
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
        // create 2 point a and b
        Point2D A= new Point2D(3,4);
        Point2D B= new Point2D(6,7);
        // diplay coordinates a and b
        System.out.println("A has coordinates:");
        A.display();
        System.out.println("B has coordinates:");
        B.display();
        //move point A to new position
        A.move(4,2);
        System.out.println(" New cooordinates of A are: ");
        A.display();
        // caculate the distance from point A to point B
        double d= A.distance(B);
        System.out.println(" The distance from A to B is: " +d);
    }
}

