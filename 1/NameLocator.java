import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class NameLocator 
{
	String fName;  
	static WebDriver driver;  
	
	public WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	    DriverSetup st=new DriverSetup();
	    driver=st.getWebDriver();
	    return driver;
	}
	public String getNameLocator()
	{
       /*Identify the Firstname
	     Get the placeholder value
         Store the placeholder value in the static variable fName.*/
         try{
        fName=driver.findElement(By.name("fname")).getAttribute("placeholder");
         }
         catch(Exception e)
         {}
       return fName;
	}
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	}
}