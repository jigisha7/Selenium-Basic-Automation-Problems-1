import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Registration
{
	static WebDriver driver;
	static String baseUrl;
	public WebDriver setupDriver()
	{
	    baseUrl="http://webapps.tekstac.com/Shopify/";
	    //Assign the value for baseUrl
	    /* Get the driver, and launch the app using get() with baseUrl */
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getWebDriver();
	    driver.get(baseUrl);
	    return driver;
	}

	public void setElements()
	{
	    /*Using the driver, Find the elements by id and send the values to the elements*/
        driver.findElement(By.id("firstname")).sendKeys("Mithali");
        driver.findElement(By.id("lastname")).sendKeys("Raj");
        driver.findElement(By.id("username")).sendKeys("Mithali Raj");
        WebElement city=driver.findElement(By.id("selectcity"));
        Select selcity=new Select(city);
        selcity.selectByIndex(2);
        driver.findElement(By.xpath("//body/form[1]/div[6]/input[2]")).click();
      //  gender.selectByIndex(2);
        driver.findElement(By.id("pass")).sendKeys("MR@123");
        driver.findElement(By.id("reg")).click();
	}
	public static void main(String[] args)
	{
	    Registration reg=new Registration();
	    //Implement Code Here
	    WebDriver driver=reg.setupDriver();
	    reg.setElements();
	}
}