package javacodesforpractise;

public class WideningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;

		 // automatic type conversion
		 long l = i;

		 // automatic type conversion
		 float f = l;
		 System.out.println("Int value "+i);
		 System.out.println("Long value "+l);
		 System.out.println("Float value "+f); 

	}

}
/*
 * Output- 
 * Int value 100 
 * Long value 100 
 * Float value 100.0
 */