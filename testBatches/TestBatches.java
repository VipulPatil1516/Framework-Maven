package testBatches;


import org.junit.Test;

import gUtilities.ReadProperties;
import testScenarios.TestCases;

public class TestBatches 
{

	TestCases testCases;
	ReadProperties config;
	public static String env;
	public TestBatches()
	{
		config= new ReadProperties("TestData/Config.properties");
		env = config.readData("Environment");
		testCases = new TestCases();
	}
	@Test
	public void runUserChoice()
	{
		System.out.println("***********Execution Summary***********");
		System.out.println("TestingType:"+ config.readData("TestingType").toUpperCase());
		System.out.println("Environment/Server:"+ config.readData("Environment").toUpperCase());
		System.out.println("***************************************");
		if(config.readData("TestingType").equalsIgnoreCase("SMOKE"))
		{
			smokeSuite();
		}
		else if(config.readData("TestingType").equalsIgnoreCase("REGRESSION"))
		{
			regressionSuite();
		}
		else
		{
			System.out.println("Testing type is not supported:"+ config.readData("TestingType"));
		}
	}
	
	@Test
   public void smokeSuite()
   {
	   System.out.println("Test Suite: SMOKE");
       testCases.bookBusTicketAndCancel();
       testCases.bookBusTicketAndPrint();
       testCases.bookBusTicketAndTrackService();
   }
   @Test
   public void regressionSuite()
   {
	   System.out.println("Test Suite: REGRESSION");
	   testCases.bookBusTicketAndCancel();
       testCases.bookBusTicketAndPrint();
       testCases.bookBusTicketAndTrackService();
       testCases.bookBusTicketPrintAndTrackService();
       testCases.bookBusTicketAndCheckStatus();
   }
}
