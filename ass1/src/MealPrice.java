import java.util.Scanner;

public class MealPrice {

	public static void main(String[] arg)
	{
	   double mealcost;
	   int   tipPercent;
	   int taxPercent;
	   double totalCost;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter meal cost");
	   mealcost=sc.nextInt();
	   tipPercent=sc.nextInt();
	   taxPercent=sc.nextInt();
	   totalCost=mealcost+(mealcost*tipPercent)/100+(mealcost*taxPercent)/100;
	   System.out.println("The Total Meal Cost is "+Math.round(totalCost)+" dollars");
	}
}