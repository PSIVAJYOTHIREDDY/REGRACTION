Feature: verfiying facebook details
  Scenario Outline: verifying login details with valid credentilas
  Given user is on facebook page
  When user enters "<username>" and "<password>"
  And user click the login button
  Then user verify the success message
  
  Examples:
   |username|password|
	 |Greens  |Java    |
