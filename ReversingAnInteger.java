package javacodesforpractise;

public class ReversingAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1001, reversedInteger=0;
		//int originalNumber,reminder;
		//originalNumber=num;
		while (num!=0) 
		{
			int reminder=num%10;
			reversedInteger=reversedInteger*10+reminder;
			num=num/10;
		}
		/*
		 * if (originalNumber == reversedInteger)
		 * System.out.println("The given number is palindrome"); else
		 */
			System.out.println("The value after reverse is = " + reversedInteger);


	}

}
