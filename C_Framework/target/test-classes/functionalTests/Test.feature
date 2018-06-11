Feature: Facebook login feature
Scenario: Testing facebook login
Given  Facebook is launched with URL
When  I enter "sagarseleniumstl@gmail.com" 
And I enter password
And I Click login
Then Homepage is displayed