Feature: Static List

 Scenario: Verify user can create Static List
	Given I am on overview page
	When I click on Static Lists tab
	Then I see Static Lists page
	When I click on Create New List button on static lists page
	Then I see create a new list modal window
	When I enter text TestUser in name textbox
	And I enter text ABCDE in description textbox
	And I click Create List button in create a new list modal window
	Then I see TestUser static list in static list table
	
	
 Scenario: Verify user can delete the static list
	Given I am on Static list page
	When I delete Static List
	Then I am not able to view TestUser static list on static list page