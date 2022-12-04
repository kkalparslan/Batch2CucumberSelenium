
Feature: Krafttech Log in Test

  Scenario: Login as Alparslan
    Given The user is on the login page
    When The user enters Alparslan credentials
    Then The user should be able to login

  Scenario: Login as Jhon Nash
    Given The user is on the login page
    When The user enters Jhon Nash credentials
    Then The user should be able to login

