package in.amazon;


import java.util.Random;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Productselection extends LaunchBrowser{

	@Test(priority=4) 
	public void Searchresults()
	{	
		Reporter.log(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		
	}
	@Test(priority=5) 
	public void Randprdselection()
	{	
	Random rand = new Random();
	int Rand = rand.nextInt(10)+1;
	List<WebElement>li= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])["+Rand+"]")).click();
	int list_size = li.size();
	Reporter.log("Randomly selected product:"+  driver.getTitle() );
	}
	
}
