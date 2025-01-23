import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Registration    //DO NOT Change the class Name
{
	static String baseUrl; //Assign the value for baseUrl
	Select selobj;
	WebDriver driver;
	public WebDriver createDriver()       //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	   //use getWebDriver method
	   DriverSetup ds=new DriverSetup();
	   driver=ds.getWebDriver();
	   return driver;
	}
	public void navigate(WebDriver driver)   //DO NOT change the method signature
	{
	    // set the url to baseUrl and navigate ("http://webapps.tekstac.com/InvoiceUpdates/")
	    baseUrl="http://webapps.tekstac.com/InvoiceUpdates/";
	    driver.get(baseUrl);
	}
	public Select getCategoryElement(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the driver*/
	   /* Select Value "Utility Invoice" from 'Category' (drop-down) and return the select element
             * Declare the drop-down element as an instance of the Select class.
             * Return select object    */
             WebElement Category=driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]"));
             selobj=new Select(Category);
             selobj.selectByVisibleText("Utility Invoice");
             return selobj;
	}
	public void setFormValues(WebDriver driver)  //DO NOT change the method signature
	{
	  /*Using the driver, Find the elements by id and send the values to the elements */
      /*  Send 'Rakesh' for 'name'
               '123' for 'number'
                'new user' for user type
                'Utility Invoice' for select
                '1000' for 'amount'
                '9876543210' for phone
                'New User Invoice' for 'comments'
      */
      WebElement nm=driver.findElement(By.id("name"));
      nm.sendKeys("Rakesh");
      WebElement no=driver.findElement(By.id("number"));
      no.sendKeys("123");
      WebElement utype=driver.findElement(By.id("newUser"));
      utype.click();
     WebElement ct=driver.findElement(By.xpath("//tbody/tr[5]/td[2]/select[1]"));
     Select ss=new Select(ct);
     ss.selectByVisibleText("Utility Invoice");
      WebElement amt=driver.findElement(By.name("amount"));
      amt.sendKeys("1000");
      WebElement phn=driver.findElement(By.name("num"));
      phn.sendKeys("9876543210");
      WebElement cmnt=driver.findElement(By.name("comments"));
      cmnt.sendKeys("New User Invoice");
      WebElement sub=driver.findElement(By.id("submit"));
      sub.click();
	}
	public WebElement getSuccessMessageElement(WebDriver driver) //DO NOT change the method signature
	{
	    //Get the message element and return it
	    //After registration a success message is displayed. Identify and return the WebElement of the same.
	    WebElement ell=driver.findElement(By.id("result"));
	    return ell;
	}
	public String getSuccessMessage(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the WebElement of success message displayed and return it.
	    String msg=element.getAttribute("placeholder");
	    return msg;
	}
	 public static void main(String[] args){
	    //Registration reg=new Registration();
	    //Add required code
	    Registration robj=new Registration();
	   WebDriver driver= robj.createDriver();
	   robj.navigate(driver);
	   Select obj=robj.getCategoryElement(driver);
	   robj.setFormValues(driver);
	   WebElement  ele=robj.getSuccessMessageElement(driver);
	   String message=robj.getSuccessMessage(ele);
	   //System.out.println(message);
	}
}