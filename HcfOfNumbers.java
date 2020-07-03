package javacodesforpractise;

public class HcfOfNumbers {

	public static void main(String[] args) 
	{
		int n1=120,n2=240,hcf=1;
		for (int i = 1; i <=n1&&i<=n2; i++) 
		{
			if (n1%i==0&&n2%i==0) 
			hcf=i;
		}
		System.out.printf("Hcf of %d and %d is %d",n1,n2,hcf);

	}

}
