package javacodesforpractise;

public class SumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		int n=200,sum=0;
		for(int i=1;i<=n;i++)
		{
		    if(i%2==0)
		    {
		        sum=sum+i;
		    }
		    
		}
		System.out.println("Sum of even numbers is = " +sum);

	}


}


