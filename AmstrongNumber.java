package javacodesforpractise;
public class AmstrongNumber{

    public static void main(String []args)
    {
       int num=371,reminder,originalnum;
		double result=0;
       originalnum=num;
       while(originalnum!=0)
       {
           reminder=originalnum%10;
           result=result+Math.pow(reminder,3);
           originalnum=originalnum/10;
       }
       if(result==num)
       System.out.println("Amstrong");
       else
       System.out.println("Not Amstrong");
       
    }
}
/* Output-Amstrong */