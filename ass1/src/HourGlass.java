import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] m=new int[6][6];
    int[][] tmp=new int[3][3];
    int i,j,a,b;
    int[] total=new int[16];
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the matrix");
    for(i=0;i<6;i++)
    	for(j=0;j<6;j++)
            m[i][j]= sc.nextInt();
    
    for(i=0,a=0;i<6&&a<3;i++,a++)
    	for(j=0,b=0;j<6&&b<3;j++,b++)
    	{
    		tmp[a][b]=m[i][j];
    	}
    
		
	}

	int sum(int[][] a)
	{
		int total=0;
		return total;
	}
}
