package javacodesforpractise;

public class Loan {
	String loanname;
	int roi;
	
	Loan(String loanname,int roi)
	{
		this.loanname=loanname;
		this.roi=roi;
	}
	
	public static void main(String[] args) 
	{
		Loan l1=new Loan("Home Loan",15);
		System.out.println("The loan taken is -> " + l1.loanname);
		System.out.println("The roi for the loan taken is -> " + l1.roi);

	}

}
/*
 * Output- 
 * The loan taken is -> Home Loan 
 * The roi for the loan taken is -> 15
 */