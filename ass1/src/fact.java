import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter any Integer");
    n=sc.nextInt();
    while((n<2)||(n>12))
	   {
		   System.out.println("The entered Number is not in range 2 and 12. Please enter a new Number");
		   n=sc.nextInt();  
	   }
    System.out.println("The factorial of "+n+" is:"+factorial(n));
	}

	static int factorial(int n)
	{
		if((n==1)||(n==0))
		return 1;
		else
		return n*factorial(n-1);
	}
	
}
