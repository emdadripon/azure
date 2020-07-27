package pagestests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonApi;
import pages.Homepage;

public class HomePageTests extends CommonApi {
	
	@Test
	public void kp() {
		
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.whykpPage();
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div/div[1]/h1/span")).isDisplayed());
	}

}
