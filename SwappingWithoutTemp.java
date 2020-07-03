package javacodesforpractise;

public class SwappingWithoutTemp {

	public static void main(String[] args) 
	{
		int n1=32,n2=64;
		System.out.println("Before swapping the numbers are " + n1 + " and " + n2);
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("After swapping the numbers are " + n1 + " and " + n2);

	}

}
/*
 * Output- $javac SwappingWithoutTemp.java $java -Xmx128M -Xms16M
 * SwappingWithoutTemp
 */
//Before swapping the numbers are 32 and 64
//After swapping the numbers are 64 and 32