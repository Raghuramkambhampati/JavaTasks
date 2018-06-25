import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars {
	public static void main(String[] args) throws IOException
	{
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please  Enter Nuber Of Lines:");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
