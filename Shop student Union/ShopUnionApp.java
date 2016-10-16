/*@Author: Elianny Arias
  @Date 11/10/2016
  @file name: ShopUnionApp.java
  */

//import class
import java.util.Scanner;

//Main class
public class ShopUnionApp

{
 // MAin Method
public static void main (String [] args)

    {    //variables
        int QuantC;
        int QuantS;
        int QuantH;
        double totalcostC;
        double totalcostS;
        double totalcostH;
        double totalcost;



     //Declare Objects
     shopCal shop= new shopCal();
     Scanner keyboard= new Scanner(System.in);

      //Input from User
     System.out.print("Enter Quantity of Caps you like to buy: ");
     QuantC=keyboard.nextInt();

      //Input form user
      System.out.print("Enter Quantity of Shirts you like to buy: ");
	  QuantS=keyboard.nextInt();

       //Input form user
	  System.out.print("Enter Quantity of Hoodies you like to buy: ");
	  QuantH=keyboard.nextInt();


      //call set methods
     shop.SetmethodCaps(QuantC);
     shop.SetmethodShirts(QuantS);
     shop.SetmethodHoodies(QuantH);

      //call compute methods
     shop.computeCostCaps();
     shop.computeCostShirts();
     shop.computeHodies();
     shop.computeTotalcost();

    //Get values from methods
    totalcostC=shop.getTotalcostCaps();
    totalcostS=shop.getTotalcostShirts();
    totalcostH=shop.getTotalcostHoodies();
    totalcost=shop.getTotalcost();

     //Output
    System.out.println("Total cost for caps: " +totalcostC);

     System.out.println("Total cost for shirts: " +totalcostS);
     System.out.println("Total cost for hoodies: " +totalcostH);
     System.out.println("Total cost of shopping: " +totalcost);

}
}