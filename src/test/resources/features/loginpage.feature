Feature: Login Functionality for OpenCart E-commerce website

  As a user of the open cart website
  I want to be able to login in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on OpenCart Login Page

    Scenario: Successful login with valid credentials
      Given I have entered a valid username and password
      When I click on the login button
      Then I should be logged in successfully

      Scenario Outline: Unsuccessful login with invalid or empty credentials
        Given I have entered invalid "<username>" and "<password>"
        When I click on Login button
        Then I should see an error message indicating "<error_message>"
        Examples:
          | username | password | error_message |

