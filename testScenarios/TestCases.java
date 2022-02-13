package testScenarios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

//launch,logi.bookTicket,logout,close - Test Steps

public class TestCases 
{
	WebDriver driver;
	Login login; 
	Home home;
	TicketStatus ticketStatus;
	TrackService trackService;
	CancelTicket cancelTicket;
	
	@Before
	public void testCases()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new Login(driver);
		home = new Home(driver);
		ticketStatus = new TicketStatus(driver);
		trackService = new TrackService(driver);
		cancelTicket = new CancelTicket(driver);
 	}
  @Test
  public void bookBusTicketAndPrint() 
  {
	  System.out.println("Test Case: Book Bus Ticket And Print");
      login.launchApplication();
      login.loginToApplication();
      home.navigateToHome();
      home.bookTicket();
      home.printTicket();
      login.logoutFromApplication();
      login.closeApplication();
  }
  @Test
  public void bookBusTicketAndCheckStatus()
  {
	  System.out.println("Test Case: Book Bus Ticket And Check Status");
	  login.launchApplication();
      login.loginToApplication();
      home.navigateToHome();
      home.bookTicket();
      ticketStatus.navigateToTicketStatus();
      ticketStatus.checkTicketStatus();
      login.logoutFromApplication();
      login.closeApplication();
  }
  @Test
  public void bookBusTicketAndTrackService()
  {
	  System.out.println("Test Case: Book Bus Ticket And Track Service");
	  login.launchApplication();
      login.loginToApplication();
      home.navigateToHome();
      home.bookTicket();
      trackService.navigateToTrackStatus();
      trackService.trackTicketService();
      login.logoutFromApplication();
      login.closeApplication();
  }
  @Test
  public void bookBusTicketAndCancel()
  {
	  System.out.println("Test Case: Book Bus Ticket And Cancel");
	  login.launchApplication();
      login.loginToApplication();
      home.navigateToHome();
      home.bookTicket();
      cancelTicket.navigateToCancelTicket();
      cancelTicket.cancelTheTicket();
      login.logoutFromApplication();
      login.closeApplication();
  }
  @Test
  public void bookBusTicketPrintAndTrackService()
  {
	  System.out.println("Test Case: Book Bus Ticket Print And Track Service");
	  login.launchApplication();
      login.loginToApplication();
      home.navigateToHome();
      home.bookTicket();
      trackService.navigateToTrackStatus();
      trackService.trackTicketService();
      login.logoutFromApplication();
      login.closeApplication();   
  }
}
