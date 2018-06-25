import java.io.IOException;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Integer n;
		System.out.println("Please  Enter Any Number:");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
	    System.out.println(n+"*"+i+"="+n*i);
	}
}
