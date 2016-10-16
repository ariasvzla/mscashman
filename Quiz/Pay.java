/*@Author: Elianny Arias
  @Date: 12/10/2016
  @File: Pay.java
  */

public class Pay
{
    //Data members
	private double basicPayrate;
	private double OvertRate;
	private int basicHours;
	private int OvertHours;
	private double basicPayrateW;
	private double OvertPay;
	private final double OVERT=1.5;
	private double totalPay;

         //constructor
		public Pay(){
			basicPayrate=0;
			basicHours=0;
			OvertHours=0;
			OvertPay=0;

			basicPayrateW=0;
			OvertRate=0;
			totalPay=0;
         }

                //set method for basic pay rate
				public void setMethods (double basicPayrate){
					this.basicPayrate=basicPayrate;
				}
                //set method for basic hours
				public void setMethods2 (int basicHours){
					this.basicHours=basicHours;
				}
                //set method for overtime hours
				public void setMethods3 (int OvertHours){
					this.OvertHours=OvertHours;
				}

                //compute method for overtime
				public void computeOvert(){
					OvertRate=basicPayrate*OVERT;
				}

                 //compute basic overtime and total pay
				public void computeAll(){
				  basicPayrateW=basicPayrate*basicHours;
				  OvertPay=OvertHours*OvertRate;
				  totalPay=basicPayrateW+OvertPay;
				 }
                 //Get  basic rate value
				 public double getBasicpayrateW(){
				 	return  basicPayrateW;
				 }
                 //Get  overtime rate value
				 public double getOvertimePay(){
				  	return  OvertPay;
				 }
                 //Get  total pay rate value
				 public double gettotalPay(){
				  	return  totalPay;
				 }

 }