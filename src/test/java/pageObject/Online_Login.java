package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Online_Login {

	WebDriver driver;
	public Online_Login(WebDriver iDriver)
	{
		driver=iDriver;
		PageFactory.initElements(driver, this);
	}

	// Repo
	@FindBy (id="Email") WebElement email;
	@FindBy (id="Password") WebElement pass;
	@FindBy (xpath ="//button[@type='submit']") WebElement loginBTn;
	@FindBy (xpath ="//ul[@class='navbar-nav ml-auto pl-2']/child::li[3]/child::a") WebElement logoutLink;

	public void enterEmailId(String em)
	{
		email.clear();
		email.sendKeys(em);
	}

	public void enterPassword(String pw)
	{
		pass.clear();
		pass.sendKeys(pw);
	}

	public void clickOnLoginBtn() throws InterruptedException
	{
		loginBTn.click();
		Thread.sleep(5000);
	}

	public void clickOnLogoutLink() throws InterruptedException
	{
		logoutLink.click();
		Thread.sleep(3000);
	}





}