Feature: Online_SearchCustomers

Background: Common Steps for all Scenario
					Given User Launch Chrome Browser
				When User Opens URL "https://admin-demo.nopcommerce.com/login"
				And User enters Email as "admin@yourstore.com" and Password as "admin"
				And Click on Login button
				Then Page Title should be "Dashboard / nopCommerce administration"
				When user click on Customers Menu
				And User click on Customer Menu Item
				Then After Customer Menu Page title should be "Customers / nopCommerce administration"	
Scenario: Search Customer by using Email Id
			
				When user enters email id as "james_pan@nopCommerce.com"
				And User Clicks on Search button
				Then User Name should be "James Pan"
				When User click on Logout Link
				Then After Logout Page Title should be "Your store. Login"
				And Close browser
			
Scenario: Search Customer by using First Name
			
				When user enters First Name as "James"
				And User Clicks on Search button
				Then User Email id should be "james_pan@nopCommerce.com"
				When User click on Logout Link
				Then After Logout Page Title should be "Your store. Login"
				And Close browser