package lesson2;

import java.util.Random;

public class doityoursefl3 {

	public static void main(String[] args) {
		Random random = new Random ();
		 int randomInt = random.nextInt(100);
		 System.out.println (" random interger: " + randomInt );
		 double randomDouble = random.nextDouble();
		 System.out.println(" ramdom double: " + randomDouble);
		 boolean randomBoolean = random.nextBoolean();
		 System.out.println(" random boolean: " + randomBoolean);
		 double randomGaussian = random.nextGaussian();
		 System.out.println (" random Gaussian: " + randomGaussian);
		 random.setSeed(12345);
		 long randomLong = random.nextLong();
		 System.out.println(" random long: " +randomLong);
		 float randomFloat = random.nextFloat();
		 System.out.println(" random float: " +randomFloat);
	     int code = (int) Math.floor(((Math.random()* 899999)+ 100000));
	     System.out.println (" random math: " +code);
	     int randomBoundedInt = random.nextInt(50) + 10;
	     System.out.println(" random bounded interger: " + randomBoundedInt);
	     Short randomShort = (short) random.nextInt(Short.MAX_VALUE+1);
	     System.out.println (" Random short: " + randomShort);
	     random.setSeed(123456);
	        System.out.println("Random with Seed:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(random.nextInt(100) + " ");
	        }
	        System.out.println();
	}

}
