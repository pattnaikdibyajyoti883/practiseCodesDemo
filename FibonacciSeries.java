package javacodesforpractise;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int num=10,t1=0,t2=1;
		System.out.println(" First " + num + " terms ");
		for (int i = 1; i <=num; i++)  
		{
			System.out.println(t1 + " + ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(t2);
		}

	}

}
