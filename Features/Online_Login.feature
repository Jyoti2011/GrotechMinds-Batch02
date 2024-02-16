Feature: Online_Login

@Smoke 
Scenario: Successful Login with valid Credentials

				Given User Launch Chrome Browser
				When User Opens URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "admin@yourstore.com" and Password as "admin"
				And Click on Login button
				Then Page Title should be "Dashboard / nopCommerce administration"
				When User click on Logout Link
				Then After Logout Page Title should be "Your store. Login"
				And Close browser
				
				
	@Sanity			
Scenario Outline: Successful Login with valid Credentials DDT

				Given User Launch Chrome Browser
				When User Opens URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "<email>" and Password as "<Password>"
				And Click on Login button
				Then Page Title should be "Dashboard / nopCommerce administration"
				When User click on Logout Link
				Then After Logout Page Title should be "Your store. Login"
				And Close browser
				
				
Examples:
|email|Password|
|admin@yourstore.com|admin|
|jyo@j.com|admin123|