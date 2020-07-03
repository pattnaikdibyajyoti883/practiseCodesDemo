package javacodesforpractise;

public class SumOfOddNumber 
{
	public static void main(String[] args) 
	{
		int n=2000,sum=0;
		for(int i=1;i<=n;i++)
		{
		    if(i%2!=0)
		    {
		        sum=sum+i;
		    }
		    
		}
		System.out.println("Sum of even numbers is = " +sum);

	}

}
/*
 * Output-$javac SumOfEvenNumbers.java $java -Xmx128M -Xms16M SumOfEvenNumbers
 * Sum of even numbers is = 1000000
 */
