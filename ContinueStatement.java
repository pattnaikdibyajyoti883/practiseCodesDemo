package javacodesforpractise;

public class ContinueStatement {

	public static void main(String[] args) 
	{
		System.out.println("hello world");
		for (int i = 0; i <=10; i++) 
		{
			if (i%2==0) 
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
