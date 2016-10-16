/*@Author: Elianny Arias
  @Date: 12/10/2016
  @File: PayApp.java
  */

//call class
import java.util.Scanner;

//Main class
public class PayApp{

//Main method
public static void main (String []args){
		//declare variables
		double basicPayrate;
		int basicHours,OvertHours;


		double basiPayrateW,OvertPay,totalPay;


         //decalre objects
		Pay myPay;
		myPay=new Pay();
		Scanner k=new Scanner(System.in);

        //Input from user basic pay rate weekly
		System.out.print("Enter your basic rate per hour :");
		basicPayrate=k.nextDouble();

         //Input from user basic hours
		System.out.print("Enter your basic working hours weekly: ");
		basicHours=k.nextInt();

         //Input from user overtime hours
		System.out.print("Enter your  overtime hours weekly: ");
		OvertHours=k.nextInt();


        //Call set method for basi pay rate basic hours and overtime hours
		myPay.setMethods(basicPayrate);
		myPay.setMethods2(basicHours);
		myPay.setMethods3(OvertHours);

         //call compute method for overtime rate, overtime pay , basic pay and total pay
		myPay.computeOvert();
		myPay.computeAll();

        //Process to get value for basic, overtime and total pay
		basiPayrateW=myPay.getBasicpayrateW();
		OvertPay=myPay.getOvertimePay();
		totalPay=myPay.gettotalPay();

        //Output
		System.out.println("your basic payment weekly is: " +basiPayrateW);
		System.out.println("your overtime payment weekly is: " +OvertPay);
		System.out.println("your total payment weekly is: " +totalPay);

    }

}