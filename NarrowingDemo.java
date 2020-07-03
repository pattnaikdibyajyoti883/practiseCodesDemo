package javacodesforpractise;

public class NarrowingDemo 
{
	public static void main(String[] args)
	 {
	 double d = 100.04;

	 //explicit type casting
	 long l = (long)d;
	 
	 //explicit type casting
	 int i = (int)l;
	 System.out.println("Double value "+d);

	 //fractional part lost
	 System.out.println("Long value "+l);

	 //fractional part lost
	 System.out.println("Int value "+i);
	 }

}
/*
 * Output- 
 * Double value 100.04 
 * Long value 100 
 * Int value 100
 */
