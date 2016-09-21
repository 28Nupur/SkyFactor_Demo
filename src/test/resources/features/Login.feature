Feature: User launches skyfactor application and is able to log in successfully 
Scenario: Verify user can access the skyfactor application
 	Given I am on skyfactor login page
	When I login into the application with valid credentials
	Then I land on overview page