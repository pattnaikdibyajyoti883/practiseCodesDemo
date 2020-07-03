package javacodesforpractise;

public class ProductOfIntegerUsingMethod {

	public static void main(String[] args) {
		product(100,230);
		product(20.5,3.2);

	}

	private static void product(double d, double e) {
		System.out.println("The product of the numbers = " + d*e);
		
	}

	private static void product(int i, int j) {
		System.out.println("The product of the numbers = " + i*j);
		
	}

}
