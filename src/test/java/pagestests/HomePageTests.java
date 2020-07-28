package pagestests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonApi;
import pages.Homepage;

public class HomePageTests extends CommonApi {
	
	@Test(enabled = true, priority = 0, description = "Verify KP page")
	public void kp() {
		
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.whykpPage();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div/div[1]/h1/span")).isDisplayed());
	}
	
	@Test(enabled = true)
	public void images() {
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for(WebElement allimages:images) {
			System.out.println(allimages.getAttribute("src"));
		}
	}
	
	@Test
	public void scroll() {
		WebElement ele = driver.findElement(By.linkText("Get Care"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", ele );
		ele.click();
	}

}
