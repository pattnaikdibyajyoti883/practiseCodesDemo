package javacodesforpractise;

public class MultiplicationTable {
	public static void main(String[] args) {
		 int num = 29;
		 for(int i = 1; i <= 10; ++i)
		 {
		 System.out.printf("%d * %d = %d \n", num, i, num * i);
		 }
		 }

}
/*
 * Output- $javac MultiplicationTable.java $java -Xmx128M -Xms16M
 * MultiplicationTable
 */
//29 * 1 = 29 
//29 * 2 = 58 
//29 * 3 = 87 
//29 * 4 = 116 
//29 * 5 = 145 
//29 * 6 = 174 
//29 * 7 = 203 
//29 * 8 = 232 
//29 * 9 = 261 
//29 * 10 = 290 
