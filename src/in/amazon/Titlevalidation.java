package in.amazon;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Titlevalidation extends LaunchBrowser{
	
	@Test(priority=1, invocationCount=1) 
	public void verifyTitle()
	{
		  String acttitle = driver.getTitle(); 
	      String exptitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	      Assert.assertEquals(acttitle, exptitle);
	      Assert.assertEquals(driver.getCurrentUrl().contains("amazon"), true);
	}
	@Test(priority=2) 
	public void Searchprd()
	{		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro");
		 driver.findElement(By.className("nav-input")).click();
		 String actscrtitle = driver.getTitle(); 
		 String expscrtitle = "Amazon.in : macbook pro";
		 Assert.assertEquals(actscrtitle, expscrtitle);
	}
	
	

}
