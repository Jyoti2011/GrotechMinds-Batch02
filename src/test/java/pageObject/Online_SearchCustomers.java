package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Online_SearchCustomers {
	WebDriver driver;

	public Online_SearchCustomers(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver, this);
	}

	// Repo
	@FindBy(xpath = "//nav[@class='mt-2']/child::ul/child::li[4]/child::a")
	WebElement customerMenu;
	@FindBy(xpath = "//nav[@class='mt-2']/child::ul/child::li[4]/child::ul/child::li[1]/child::a")
	WebElement customerMenuItem;
	@FindBy(id = "SearchEmail")
	WebElement emailTextBox;
	@FindBy(id = "SearchFirstName")
	WebElement fNameTextBox;
	@FindBy(id = "search-customers")
	WebElement searchBTN;
	@FindBy(xpath = "//table[@id='customers-grid']/child::tbody/child::tr[1]/child::td[3]")
	WebElement verifyName;
	@FindBy(xpath = "//table[@id='customers-grid']/child::tbody/child::tr[1]/child::td[2]")
	WebElement verifyEmail;
	
	public void clickOnCustomerMenu() throws InterruptedException
	{
		customerMenu.click();
		Thread.sleep(2000);
	}
	public void clickOnCustomerMenuItem() throws InterruptedException
	{
		customerMenuItem.click();
		Thread.sleep(2000);
	}
	
	public void searchByEmail(String em)
	{
		emailTextBox.sendKeys(em);
	}
	
	public void searchByfName(String fn)
	{
		fNameTextBox.sendKeys(fn);
	}
	
	public void clickOnSearchBtn() throws InterruptedException
	{
		searchBTN.click();
		Thread.sleep(2000);
	}
	
	public String verifyByName()
	{
		return verifyName.getText();
	}
	
	public String verifyByEmail()
	{
		return verifyEmail.getText();
	}
}
