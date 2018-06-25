import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class split {
	public static void main(String[] args) throws IOException
	{
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please  Enter Any String along with semicolon:");
		String s1=br.readLine();
		String[] s2=s1.split(":");
		int i;
		System.out.println("After breaking the strings are");
		for(i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
	}
}
