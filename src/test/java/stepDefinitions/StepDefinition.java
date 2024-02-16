package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Online_Login;
import pageObject.Online_SearchCustomers;

public class StepDefinition {

	
	@Before
	public void beforeMethod()
	{
		System.out.println("Very First line to execute");
	}
	
	
	 WebDriver driver;
	 Online_Login ol;
	 Online_SearchCustomers os;
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    driver=new ChromeDriver();
	   ol=new Online_Login(driver);
	   os=new Online_SearchCustomers(driver);
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
	   driver.get(url);
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String eml, String pwd) {
	    ol.enterEmailId(eml);
	    ol.enterPassword(pwd);
	}

	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
	   ol.clickOnLoginBtn();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle);	

	}

	@When("user click on Customers Menu")
	public void user_click_on_customers_menu() throws InterruptedException {
	    os.clickOnCustomerMenu();
	}

	@When("User click on Customer Menu Item")
	public void user_click_on_customer_menu_item() throws InterruptedException {
	   os.clickOnCustomerMenuItem();
	}

	@Then("After Customer Menu Page title should be {string}")
	public void after_customer_menu_page_title_should_be(String expTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle);	
	}

	@When("user enters email id as {string}")
	public void user_enters_email_id_as(String email) {
	    os.searchByEmail(email);
	}

	@When("user enters First Name as {string}")
	public void user_enters_first_name_as(String fname) {
	    os.searchByfName(fname);
	}
	@When("User Clicks on Search button")
	public void user_clicks_on_search_button() throws InterruptedException {
	   os.clickOnSearchBtn();
	}

	@Then("User Name should be {string}")
	public void user_name_should_be(String un) {
	    String fname=os.verifyByName();
	    Assert.assertEquals(un, fname);	
	}
	
	@Then("User Email id should be {string}")
	public void user_email_id_should_be(String em) {
		 String emailId=os.verifyByEmail();
		    Assert.assertEquals(em, emailId);	
	}

	@When("User click on Logout Link")
	public void user_click_on_logout_link() throws InterruptedException {
	  ol.clickOnLogoutLink();
	}

	@Then("After Logout Page Title should be {string}")
	public void after_logout_page_title_should_be(String expTitle) {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle);
	}

	@Then("Close browser")
	public void close_browser() {
	   driver.quit();
	}

	@After
	public void tearDown()
	{
		 driver.quit();
	}

}
