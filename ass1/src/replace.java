import java.io.IOException;
import java.util.Scanner;

public class replace {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please  Enter Any String:");
		String s1=new String(sc.nextLine());
		int i,j;
		System.out.println("Enter the character to be replaced");
		String str1=sc.nextLine();
		System.out.println("Enter the new character to be placed");
		String str2=sc.nextLine();
		char ch1=str1.charAt(0);
		char ch2=str2.charAt(0);
		s1=s1.replace(ch1,ch2);
	    System.out.println("Newstring:"+s1);
	}

}
