#Author: Priya Durai
#Date: 7th Aug, 2021
#Description: This is to verify all functionalities of Chapter one page
Feature: Chapter One Functionalities

  @LoginTest
  Scenario: Verify Chapter One link

    Given user is on homepage
    When the user clicks on the Chapter1 link
    Then the user is navigated to Chapter one page

