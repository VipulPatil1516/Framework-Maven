package pageObjects;

import org.openqa.selenium.WebDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class CancelTicket
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	public CancelTicket(WebDriver driver)
	{
		this.driver= driver;
		data = new ReadProperties("TestData/DevData.properties");
	}
  public void navigateToCancelTicket()
  {
	  System.out.println("RC:Navigate to Cancel Ticket");
	  appUtils.getElement("//a[@title='Cancel Ticket']").click();
  }
  public void cancelTheTicket()
  {
	  System.out.println("RC: Cancel The Ticket");
	  appUtils.getElement("//input[@name='id']").sendKeys(data.readData("TicketNumber"));
  }
	
}
