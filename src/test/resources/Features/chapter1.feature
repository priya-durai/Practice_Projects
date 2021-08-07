#Author: Priya Durai
#Date: 7th Aug, 2021
#Description: This is to verify all functionalities of Chapter one page
Feature: Chapter One Functionalities

  @LoginTest
  Scenario: Verify Chapter One link

    Given user is on homepage
    When the user clicks on the Chapter1 link
    Then the user is navigated to Chapter one page

  @LoginTest
  Scenario Outline: Select Selenium option from dropdown

    Given user is on Chapter One page
    When the user selects the "<DropdownOption>" value from dropdown
    Then the desired value should be selected and displayed

    Examples:
      | DropdownOption |
      | Selenium Grid  |