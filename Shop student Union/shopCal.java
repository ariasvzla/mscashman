/*@Author: Elianny Arias
  @Date 11/10/2016
  @file name: ShopCal.java
  */


		public class shopCal



		{
          //data members
			private int QuantC;
			private int QuantS;
			private int QuantH;
			private double totalcostC;
			private double totalcostS;
			private double totalcostH;
			private double totalCost;
			final private double CAPS=50.00;
			final private double SHIRTS=10.00;
			final private double HODIES=20.00;

            //constructor
			public shopCal()
			{
				int QuantC=0;
				int QuantH=0;
				int QuantS=0;
				double totalcostC=0;
				double totalcostS=0;
				double totalcostH=0;
				double totalCost=0;

		    }


             //set methods
		    public void SetmethodCaps(int QuantC)

		    {
				this.QuantC=QuantC;

			}

			 public void SetmethodShirts(int QuantS)

		    {
							this.QuantS=QuantS;

			}

			 public void SetmethodHoodies(int QuantH)
		     {
							this.QuantH=QuantH;

			 }


              //Compute Methods
			public void computeCostCaps()
			{
				totalcostC=QuantC*CAPS;
			}

			public void computeCostShirts()
			 {
				totalcostS=QuantS*SHIRTS;
			 }

             public void computeHodies()
			 {
				totalcostH=QuantH*HODIES;
			 }

             public void computeTotalcost()
			 {
 			   totalCost=totalcostC+totalcostS+totalcostH;
			 }


              //get methods
             public double getTotalcostCaps()
             {
				 return totalcostC;
			 }


			 public double getTotalcostShirts()
			 {
		     	 return totalcostS;
			 }


			 public double getTotalcostHoodies()
             {
				 return totalcostH;
			 }


			 public double getTotalcost()
			 {
				 return totalCost;

             }





}

