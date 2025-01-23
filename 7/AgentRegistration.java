import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AgentRegistration { //DO NOT change the class name
	static WebDriver driver;
	public WebDriver createDriver(){
		//Create driver, store in in static variable 'driver' and return it
		DriverSetup ds=new DriverSetup();
		driver=ds.getWebDriver();
		//driver.get("https://webapps.tekstac.com/Agent_Registration/");
		return driver;
	}
	public void setNewFormValues(String firstname,String lastname,String username,String password,String phonenumber,String email)
	{
		//Find the form elements and set values by passing those values from 'main' method.
		//Submit invalid details to retrieve the error message
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("phonenumber")).sendKeys(phonenumber);
	    driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.id("submit")).click();
	}
	public String getErrorMessage(){
		//locate the error message and retrieve the text using gettext
		//WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		WebElement ele=driver.findElement(By.id("message"));
		String msg=ele.getText();
		return msg;
	}
	public void Reset(){
	   // driver.navigate().back();
	   // String url=driver.getCurrentUrl();
	    //driver.get(url);
	    WebElement rt=driver.findElement(By.id("reset"));
	    rt.click();
		//Navigate to the previous page and check reset
	}
	public static void main(String[] args) {
		AgentRegistration agent=new AgentRegistration();
		//Add required code
		WebDriver driver=agent.createDriver();
		agent.setNewFormValues("John","Smith","JohnSmith","pass123","9876543210",null);
    	String res=agent.getErrorMessage();
		//agent.Reset();
	}
}