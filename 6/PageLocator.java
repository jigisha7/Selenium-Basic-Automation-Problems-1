import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PageLocator    //DO NOT Change the class Name
{
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   //Invoke getWebDriver method from DriverSetup and return it
	   return DriverSetup.getWebDriver();
	}
	public WebElement getPageLocator(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the WebElement of 'Lastname'*/
	   /*Find the element by id */
	  // WebElement element;
	   return driver.findElement(By.id("lastname"));
	}
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    //String nm;
	    return element.getAttribute("placeholder");
	}
	public static void main(String[] args){
	    PageLocator pp=new PageLocator();
	    //Add required code
	   WebDriver driver= pp.createDriver();
	   WebElement element=pp.getPageLocator(driver);
	   String name=pp.getName(element);
	}
}