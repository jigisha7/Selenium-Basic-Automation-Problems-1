import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Main
{
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriver setDriver() {
	    //Create driver. Assign it to static variable 'driver' and return it.
	    DriverSetup ds=new DriverSetup();
	    driver=ds.getWebDriver();
	    //driver.get("https://webapps.tekstac.com/Login_Servlet_3883/");
	    return driver;
	}
	public static void userName(String user) throws Exception {
		// Method to locate text box Username by its name & pass the parameter as input
		driver.findElement(By.name("username")).sendKeys(user);
	}
	public static void password(String pwd) throws Exception{
		// Method to locate text box Password by its name & pass the parameter as input
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	public static void clickLoginButton() throws Exception{
		// Method to locate the Login Button by its name & click it
		driver.findElement(By.name("login")).click();
	}
	public static void navigateBackward() {
		// Method to go to previous page in browser
		driver.navigate().back();
		//String newurl=driver.getCurrentUrl();
	//	driver.get(newurl);
	}

    public static String getUsernameValue() throws Exception {
        //Follow the same step you are using to get value for 'userText' in the method 'checkText'. Return the 'userText' value.
        WebElement nm=driver.findElement(By.name("username"));
        String res=nm.getAttribute("value");
        return res;
    }
    	public static void checkText(String userNameCheck) throws Exception {
		// Method to validate the data displayed in Username text box with the input you gave
		// Create a string variable 'userText' to store the value from text box
		// And do the validation with the input you already entered
		// Print the result if given input is same or not
		String result=driver.findElement(By.name("username")).getAttribute("value");
		if(result.equalsIgnoreCase(userNameCheck))
		System.out.println("same");
		else
		System.out.println("not");
	}
	public static void closeBrowser() {
		// Method to close the Browser
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		// Invoke all the above methods
		// Store "John" in a string 'userName' & use for FirstName
		// Password input is "War235e36@#"
		Main obj=new Main();
		WebDriver driver=obj.setDriver();
		String userName="John";
		obj.userName(userName);
		obj.password("War235e36@#");
		obj.clickLoginButton();
		obj.navigateBackward();
		//String unm=obj.getUsernameValue();
		obj.checkText(userName);
		String unm=obj.getUsernameValue();
		obj.closeBrowser();
	}
}
