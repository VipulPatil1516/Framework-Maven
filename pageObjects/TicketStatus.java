package pageObjects;

import org.openqa.selenium.WebDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;

public class TicketStatus
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	public TicketStatus(WebDriver driver)
	{
		this.driver= driver;
		data = new ReadProperties("TestData/"+TestBatches.env+"DevData.properties");
	}
   public void navigateToTicketStatus()
   {
	   System.out.println("RC: Navigate to TicketStatus");
       appUtils.getElement("//a[@title='Home']").click();
   }
   public void checkTicketStatus()
   {
	   System.out.println("RC: Check Ticket Status");
       appUtils.getElement("//input[@name='id' and @class='searchTktCancel']").sendKeys(data.readData("TicketNumber"));
   }
	
}
