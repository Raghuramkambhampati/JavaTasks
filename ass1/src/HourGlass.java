import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] m=new int[6][6];
    int[][] tmp=new int[3][3];
    int i,j,a,b,k,l,c,tmptotal,max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the matrix");
    for(i=0;i<6;i++)
    	for(j=0;j<6;j++)
            m[i][j]= sc.nextInt();
    System.out.println("The matrix you have Entered is :");
    for(i=0;i<6;i++)
    {
    	for(j=0;j<6;j++)
    		System.out.print(m[i][j]+" ");
    	System.out.println("");
    } 
    System.out.println("The Sub Matrixes are:");
    for(i=0,j=0,k=0,l=0,c=0;c<16;i=l)
    {
    	System.out.println("Sub matrix"+(c+1));
    for(a=0;a<3;i++,a++)
    {
    	for(b=0;b<3;j++,b++)
    	{
    		tmp[a][b]=m[i][j];
    		tmp[1][0]=0;
    		tmp[1][2]=0;
    		System.out.print(tmp[a][b]+" ");
    	}	
    	System.out.println("");
    	j=j-3;
    }	
    
    tmptotal=sum(tmp);
    if(c==0)
    	max=tmptotal;
    System.out.print("Total:"+tmptotal);
    if(tmptotal>max)
    	max=tmptotal;
       c++;
       j=++k;
       if(c%4==0)
       {
    	k=0;
        j=0;
        l++;
       }
       System.out.println("");
       System.out.println("");
       System.out.println("");
   }
    System.out.println("Maximum"+max);
}

	
static	int sum(int[][] m)
	{
		int total=0;
		int a,b;
		for(a=0;a<3;a++)
	    {
	    	for(b=0;b<3;b++)
	    	{
	    		total=total+m[a][b];
	    	}
	    }	
		return total;
	}


}
