package javacodesforpractise;

public class BreakStatement {

	public static void main(String[] args) 
	{
		System.out.println("Before the execution");
		
		for (int i = 0; i <=10; i++) 
		{
			if (i%2==0) 
			{
				break;
			}
			System.out.println(i);
		}

	}

}
