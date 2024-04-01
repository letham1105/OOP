package lesson2;
class Cube {
	private double size;
	Cube (double val)
	{
		size = val;
	}
	void setSize (double val)
	{
		size= val;
	}
	double getSize()
	{
		return size;
	}
	double volume()
	{
		return size*size*size;
	}
	void details()
	{
		System.out.println ("\ndetails of cube ");
		System.out.println ("width=" + size);
		System.out.println ("height=" +size);
		System.out.println ("length=" +size);
		System.out.println ("volume="+volume() +"\n\n");
	}
}


public class Exercise7 {
	public static void main (String args[])
	{
		Cube cube1,cube2;
		cube1 = new Cube (4);
		cube2 = new Cube (3);
		System.out.println("cube1's size=" +cube1.getSize());
		System.out.println("cube2's size=" +cube2.getSize());
		cube1.setSize(10);
		cube2.setSize(20);
		
		cube1.details();
		cube2.details();
		
		
	}

}


