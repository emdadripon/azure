package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	
	@FindBy(how = How.LINK_TEXT, using = "Why KP")
	public WebElement whykpBtn;
	
	public void whykpPage() {
		whykpBtn.click();
	}

}
