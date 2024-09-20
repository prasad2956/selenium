import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekBoxDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
     WebElement checkbox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_LBI0T1']"));	  		
	boolean actualcheckboxisdisplayed=checkbox.isDisplayed();
	boolean expectedcheckboxisdisplayed=true;
	if(actualcheckboxisdisplayed==expectedcheckboxisdisplayed)
	{
		System.out.println("chickbox is displayed");
	}
	else
	{
		System.out.println("chickbox is not displayed");
	}
	boolean actualcheckboxisenabled=checkbox.isEnabled();
	boolean expectedcheckboxisenabled=true;
	if(actualcheckboxisenabled==expectedcheckboxisenabled)
	{
		System.out.println("chickbox is enabled");
	}
	else
	{
		System.out.println("chickbox is not enabled");
	}
	boolean actualcheckboxisselected=checkbox.isSelected();
	boolean expectedcheckboxisselected=true;
	if(actualcheckboxisselected==expectedcheckboxisselected)
	{
		System.out.println("chickbox is selected");
	}
	else
	{
		System.out.println("chickbox is not selected");
	}
	}
}