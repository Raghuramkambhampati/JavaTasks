

import java.util.Scanner;

public class RangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please Enter Any number between Range 100 to 200");
	    n=sc.nextInt();
		try
		{
			if((n<100)||(n>200))
				throw new UserException("Number Out Of Range");
			else
				System.out.println(" Number In Range") ;
		}
		catch(UserException exp)
		{
			System.out.println(exp) ;
		}
	}

}
