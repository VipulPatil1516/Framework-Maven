package gUtilities;

public class GeneralUtility 
{
   public static void fixedWait(int timeInSec)
   {
	   try{
		   Thread.sleep(timeInSec *1000); 
	   } catch (InterruptedException e)
	   {
		   e.printStackTrace();
	   }
   }
}
