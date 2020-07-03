package javacodesforpractise;

public class SwappingUsingTemp {

	public static void main(String[] args) 
	{
		float f1=234.98f, f2=754.34f,temp;
		System.out.print("Before swapping the numbers are- " + f1 + " and " + f2);
		temp=f1;
		f1=f2;
		f2=temp;
		System.out.print("After swapping the numbers are- " + f1 + " and " + f2);

	}

}
