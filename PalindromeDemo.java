package javacodesforpractise;

public class PalindromeDemo {

	public static void main(String[] args) 
	{
		int num=1001, reversedInteger=0,originalNumber,reminder;
		originalNumber=num;
		while (num!=0) 
		{
			reminder=num%10;
			reversedInteger=reversedInteger*10+reminder;
			num=num/10;
		}
		if (originalNumber == reversedInteger) 
		System.out.println("The given number is palindrome");
		else
			System.out.println("The given number is not a palindrome");

	}

}
