import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class PrintOptions {        //Do not change the class name
	WebElement element;
	static Select select;
	static WebDriver driver;
	List<WebElement> list;
	public WebDriver setDriver(){
		/*Create the Webdriver. Assign to variable 'driver' and return it. */
		DriverSetup ds=new DriverSetup();
		driver=ds.getDriver();
		return driver;
	}
	public String[] getOptions( ){
		//Identify the Name dropdown**********
	    // print all the drop down values using List******
	    //By using loop select the given Name

	  	//Select ' city' drop down box ( Use Name locator to identify the element )
		//Get all the options for the selected drop down box
		// Setting up the loop to get all the options
		/* Storing the value of the option in a string array
		    Declare a string array with the size of the drop down list. Ex: String[] resultList=new String[SIZE OF THE DROPDOWN LIST]  */
		// Printing the stored value
		//return the string array.
		WebElement dropdown=driver.findElement(By.name("city"));
		Select selobj=new Select(dropdown);
		list=selobj.getOptions();
		String[] resultList=new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
		    resultList[i]=list.get(i).getText();
		    System.out.println(resultList[i]);
		}
		return resultList;
	}
   public void closeBrowser(){
	   //close browser
	   driver.close();
   }
	public static void main(String[] args)
	{
		PrintOptions ps=new PrintOptions();
		//Add required code
		WebDriver driver=ps.setDriver();
		String arr[]=ps.getOptions();
		//ps.closeBrowser();
	}
}