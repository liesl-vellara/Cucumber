#writing the feature
#To test the feature with valid data and invalid data
Feature: Test the skillary app
1 Valid Case
2 Invalid Case

# if the pre-requiste is common, we use Backgroup
# we cannot use conditions even if they are common
# Background is used to work with common things, example: given is same for all scenarios
Background: 
Given I open the browser and navigate to the URL

# Whatever values you want to pass in the application, we use double quotes " "
# Scenario with one user (Valid Case) and passing the values
# Providing a tag to the this
@PositiveCase
# creating a scenario outline to test all positive login with valid data
Scenario Outline: To test positive tag with valid data
When Enter Username "<user>"
And Enter Password "<pwd>" 
And Click on the loginButton
Then I should see the username as "<username>" 

# writing the input values to be used in Scenario Outline
Examples: 
|user|pwd|username|
|user|user|Harry Den|
#|admin|admin|SkillRary Admin|

# Scenario with Invalid Case with values
# giving a tag for negative case
@NegativeCase
Scenario: To test the Login with Invalid Credentials
#Given: I open the browser and navigate to the URL - replaced with Background
When Enter Username "liesl"
And Enter Password "liesl"
And Click on the loginButton
Then I should navigate to the page "Register"

