import java.util.Scanner;

public class ArrTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter The Length of the array");
      n=sc.nextInt();
      while((n<1)||(n>1000))
	   {
		   System.out.println("The entered Size of the Array is not in range 1 and 10000. Please enter a new Number");
		   n=sc.nextInt();  
	   }
      int[] a=new int[n];
	  for(i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
		  while((a[i]<1)||(a[i]>10000))
		   {
			   System.out.println("The entered Number is not in range 1 and 100000. Please enter a new Number");
			   a[i]=sc.nextInt();  
		   }
	  }
	  System.out.println("Printing them in reverse order"); 
	  for(i=n-1;i>=0;i--)
		  System.out.print(a[i]+" ");
	}

}
