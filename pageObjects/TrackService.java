package pageObjects;

import org.openqa.selenium.WebDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;
import testBatches.TestBatches;

public class TrackService 
{
	WebDriver driver;
	ReadProperties data;
	ApplicationUtilities appUtils;
	public TrackService(WebDriver driver)
	{
		this.driver= driver;
		data = new ReadProperties("TestData/"+TestBatches.env+"DevData.properties");
	}
  public void navigateToTrackStatus()
  {
	  System.out.println("RC: Navigate to Track Service");
	  appUtils.getElement("//a[@title='Track Service']").click();
  }
  public void trackTicketService()
  {
	  System.out.println("RC: Check Track Ticket Status");
	  appUtils.getElement("//input[@name='ServiceCode']").sendKeys(data.readData("ServiceNumber"));
  }
}
