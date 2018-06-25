import java.util.Scanner;

public class Person
{
  int age;
  
  //A constructor which initializes the age and sets to 0 if negative 
  Person(int initialAge)
  {
	if(initialAge<0)  
	{
		System.out.println("Age is not valid,Setting to 0 ");
        age=0;
	}
	else
		age=initialAge;
  }
	
  //A method which increments the age  
  void yearPasses()
  {
  age++;
  }
   
   void amiOld()
   {
	   if(age<13)
		   System.out.println("You are young");
	   else if((age>=13) && (age<18))
		   System.out.println("You are a Teenager");
	   else 
		   System.out.println("You are Old");
   }
   
   
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   int n=0;
	   System.out.println("Please Enter Number of Test Cases");
	   n=sc.nextInt();  
	   while((n<1)||(n>4))
	   {
		   System.out.println("The entered Test cases is not in range 1 and 4. Pleas enter a new Number");
		   n=sc.nextInt();  
	   }
	   int[] age=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   age[i]=sc.nextInt();
		   while((age[i]<-5)||(age[i]>=30))
		   {
			   System.out.println("The entered Age is not in range -5 and 30. Pleas enter a new Number");
			   age[i]=sc.nextInt();  
		   }
	   }
		Person[] p=new Person[n];
	   for(int i=0;i<n;i++)
	   {
		    p[i]=new Person(age[i]);
		    p[i].amiOld();
		    p[i].yearPasses();
			p[i].yearPasses();
			p[i].yearPasses();
			p[i].amiOld(); 
			System.out.println("");
	   }
	   
   }
}
