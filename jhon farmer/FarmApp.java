/*@Author: Elianny Arias
  @Date: 11/10/2016
  @file name: FarmApp.java
  */

//Import class
import java.util.*;

public class FarmApp

{

	public static void main (String [] args)
	{
     //declare variables
	int eggs;
	int leftover;
	int boxes;

     //declare objects
    Scanner input =new Scanner(System.in);
    calculatB calc= new calculatB();

    //show output
	System.out.print("Enter How many eggs collected: ");
	eggs= input.nextInt();

     //set method
	calc.setEggs(eggs);

	//call methods to compute
    calc.computeB();
    calc.computeL();

    //get values from methods
    boxes=calc.getBoxes();
    leftover=calc.getLeftover();

      //show the output
     System.out.println("");
     System.out.println("you will need " +boxes + " boxes to collect " +eggs +" eggs " +"and your leftover is " +leftover + " eggs");
	System.out.println("");

   }
}





