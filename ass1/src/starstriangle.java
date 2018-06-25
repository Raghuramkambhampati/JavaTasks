import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class starstriangle {
	public static void main(String[] args) throws IOException
	{
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please  Enter Nuber Of Lines:");
		int n=Integer.parseInt(br.readLine());
		int f,r;
		int i,j;
		f=n;
		r=n;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<f;j++)
			{
				System.out.print(" ");
			}
			for(j=f;j<=r;j++)
			{
				System.out.print("*");
			}
			for(j=r+1;j<=n;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
			f--;
			r++;
		}
		f=2;r=2*n-2;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<f;j++)
			{
				System.out.print(" ");
			}
			for(j=f;j<=r;j++)
			{
				System.out.print("*");
			}
			for(j=r+1;j<=n;j++)
			{
				System.out.print(" ");
			}
			System.out.println("");
			f++;
			r--;
		}
		
	}
}
