import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class NameLocator
{
	static String page1, page2,page3,page4,page5,baseUrl;
	static WebDriver driver;
	public WebDriver setupDriver()
	{
	    /*Replace this comment by the code statement to get the driver*/
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getWebDriver();
	    return driver;
	  	}
	public void navigate1()
	{
	    baseUrl="https://selenium.dev/";
	    driver.navigate().to(baseUrl);
	    /*Replace this comment by the code statement to navigate to baseUrl */

	}
	public void getPageTitle1()
	{
	    /*Replace this comment by the code statement to get page title of  "https://selenium.dev/"*/
	    /* Assign the page title to variable 'page1' */
	    page1=driver.getTitle();
	}
	public void navigate2()
	{
	    /*Replace this comment by the code statement to navigate to https://www.google.co.in/ */
	    driver.navigate().to("https://www.google.co.in/");
	}
	public void getPageTitle2()
	{
	    /*Replace this comment by the code statement to get page title of  https://www.google.co.in/ */
	    /* Assign the page title to variable 'page2' */
	    page2=driver.getTitle();
	}
	public void navigateBack()
	{
	    /*Replace this comment by the code statement to navigate back */
	    driver.navigate().back();
	}
	public void getPageTitle3()
	{
	    /*Replace this comment by the code statement to get page title of backed page */
	    /* Assign the page title to variable 'page3' */
	    String current=driver.getCurrentUrl();
	    driver.get(current);
	    page3=driver.getTitle();
	}
	public void navigateForward()
	{
	    /*Replace this comment by the code statement to navigate forward */
	    driver.navigate().forward();
	}
	public void getPageTitle4()
	{
	    /*Replace this comment by the code statement to get page title of the forwarded page */
	    /* Assign the page title to variable 'page4' */
	    String current1=driver.getCurrentUrl();
	    driver.get(current1);
	    page4=driver.getTitle();
	}
	public void refreshPage()
	{
	    /*Replace this comment by the code statement to refresh the page */
	    driver.navigate().refresh();
	}
	public void getPageTitle5()
	{
	    /*Replace this comment by the code statement to get page title of refreshed page */
	    /* Assign the page title to variable 'page5' */
	  //  String current2=driver.getCurrentUrl();
	    //driver.get(current2);
	    page5=driver.getTitle();
	}
	public static void main(String[] args)
	{
	    NameLocator nm=new NameLocator();
	    WebDriver driver=nm.setupDriver();
	    nm.navigate1();
	    nm.getPageTitle1();
	    nm.navigate2();
	    nm.getPageTitle2();
    	nm.navigateBack();
	    nm.getPageTitle3();
	    nm.navigateForward();
	    nm.getPageTitle4();
	    nm.refreshPage();
	    nm.getPageTitle5();
	 }
}