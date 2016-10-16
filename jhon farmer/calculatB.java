/*@Author: Elianny Arias
  @Date: 11/10/2016
  @file name: calculatB.java
  */

public class calculatB
{
//data members
private int eggs;
private int boxes=0;
private int leftover=0;


//Constructor
public calculatB()
{
	eggs=0;

}
     //Set Methods
	public void setEggs(int eggs)
	{
      this.eggs=eggs;

     }


       //Compute how many boxes
       public void computeB ()
       {
	      boxes=eggs/12;
       }

      //Compute how many left over
	  public void computeL ()

	  {
		  leftover=eggs%12;

	  }
//Return boxes value
public int getBoxes()
{
	return boxes;
}

//return leftover value
public int getLeftover()
{
	return leftover;
}

}