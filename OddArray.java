package javacodesforpractise;
public class OddArray 
{
	public static void main(String[] args)
	 {
	     int [] array = {2,4,6,8,10,12,14,16,18,20};
	     System.out.println("Displaying odds");
	     for(int d:array){
	         System.out.println(d+1);
	     }
	 
	 }

}
/*
 * Output- $javac OddArray.java $java -Xmx128M -Xms16M OddArray Displaying odds
 * 3 5 7 9 11 13 15 17 19 21
 */