package lesson2;

	class Rectangle
	{
		private double width, height;
		 Rectangle( double widval, double heightval)
		 {
			 width = widval;
			 height= heightval;
		 }
		 double area()
		 {
			 return width * height;
		 }
	}
	public class Exercise6
	{
		public static void main (String args[]) 
		{
		Rectangle rec1, rec2;
		rec1 = new Rectangle (23,20);
		rec2 = new Rectangle (40,50);
		System.out.println (" area of rec1 is : " + rec1.area ());
		System.out.println (" area of rec2 is :" + rec2.area());
		}
	}
	
 
	
	
	
	
	
	
	
	
	
