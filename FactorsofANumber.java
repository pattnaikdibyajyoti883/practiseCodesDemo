package javacodesforpractise;

public class FactorsofANumber {

	public static void main(String[] args) {
		int num=180;
		System.out.print("Factors of " + num + " are ");
		for (int i = 1; i <=num; i++) 
		{
			if (num%i==0) 
			{
				System.out.print(i + " ");
			}
		}

	}

}

/*
 * Output- $javac FactorsofANumber.java $java -Xmx128M -Xms16M FactorsofANumber
 */
//Factors of 180 are 1 2 3 4 5 6 9 10 12 15 18 20 30 36 45 60 90 180 