package javacodesforpractise;

public class NaturalNumberDemo {
	public static void main(String[]args) {
	 int num = 20, count = 1, total = 0;
	 while(count <= num)
	 {
	 total = total + count;
	 count++;
	 }
	 if (num%7==0)
		 //break;
	 System.out.println("Stopped Execution because no. is divisible by 7");
	 else
	 System.out.println("Sum of natural number till the break point is: " +total);
	 }
	}

