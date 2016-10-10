
import java.util.*;

public class FarmApp

{

	public static void main (String [] args)
	{

	int eggs;
	int leftover;
	int boxes;

    Scanner input =new Scanner(System.in);
    calculatB calc= new calculatB();

	System.out.print("Enter How many eggs collected: ");
	eggs= input.nextInt();

	boxes=calc.boxes(eggs);
    leftover=calc.leftover(eggs);
     System.out.println("");
	System.out.println("you will need " +boxes + " boxes to collect " +eggs +" eggs " +"and your leftover is " +leftover + " eggs");

	System.out.println("");

   }
}





