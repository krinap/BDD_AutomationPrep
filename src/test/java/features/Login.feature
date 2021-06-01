Feature: Application Login


Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
And Click on Sign link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
And close browsers

Examples:
|username			|password	|
|Kp@gmail.com	|kripa		|
|test123@gmail.com	|kripa      |


Scenario Outline: Negative test with wrong email Id
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
And Click on Sign link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is getting authentication error message
And close browsers

Examples:
|username			|password	|
|test123@gmail.com	|kripa      |



Scenario Outline: Negative test with wrong email Id
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
And Click on Sign link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is getting invalid email message
And close browsers

Examples:
|username			|password	|


Scenario Outline: Negative test with wrong password 
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
And Click on Sign link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is getting wrong password message
And close browsers

Examples:
|username			|password	|




Scenario: Check Forgot Password link 
Given Initialize the browser with chrome
And Navigate to "http://automationpractice.com/index.php" Site
When User click on forgot password link
Then verify new page has forgotpassword
And close browsers