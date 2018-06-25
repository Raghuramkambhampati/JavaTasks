import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class substring 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please  Enter Any String:");
		String s1=new String(sc.nextLine());
		int i,j;
		System.out.println("Enter Starting point of substring");
		i=sc.nextInt();
		System.out.println("Enter Ending point of substring");
		j=sc.nextInt();
	    System.out.println("Substring:"+s1.substring(i,j));
	}
}