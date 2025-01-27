import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Registration
{
	String fName;
	static WebDriver driver;
	static String baseUrl;
	public WebDriver setupDriver()
	{
	    /* Invoke the getWebDriver method
	       Set value of BaseUrl
	       Launch the app using get() with baseUrl */
	       baseUrl="http://webapps.tekstac.com/Shopify/";
	       DriverSetup ds=new DriverSetup();
	       driver=ds.getWebDriver();
	       driver.get(baseUrl);
	       return driver;
	}
	public void setElements()
	{
	    /*Using the driver, Find the elements by id
	      Set the values to the elements
	      Register the form*/
       driver.findElement(By.id("firstname")).sendKeys("Rahul");
       driver.findElement(By.id("lastname")).sendKeys("Dravid");
       driver.findElement(By.id("username")).sendKeys("Rahul Dravid");
       driver.findElement(By.id("pass")).sendKeys("Rahul@123");
       driver.findElement(By.id("reg")).click();
	}
	public static void main(String[] args)
	{
	    Registration reg=new Registration();
	    /* Implement the code here */
	   WebDriver driver=reg.setupDriver();
	   reg.setElements();
	}
}