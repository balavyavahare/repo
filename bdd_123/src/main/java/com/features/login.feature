Feature: JBK Offline application test

Scenario: login test

Given user on login page
When user enters valid credentials
Then user should be on home page


Scenario:logo test
Given user on login page
Then user should see JBK Logo
