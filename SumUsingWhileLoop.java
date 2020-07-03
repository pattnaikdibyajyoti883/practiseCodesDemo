package javacodesforpractise;

public class SumUsingWhileLoop 
{
	public static void main(String[] args) 
	{
		int n=20,i=1,sum=0;
		while (i<=n) 
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of first 20 natural number is = " +sum);

	}

}
