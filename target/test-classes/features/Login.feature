@login
Feature: Krafttech Log in Test

  @smoke
  Scenario: Login as Alparslan
    Given The user is on the login page
    When The user enters Alparslan credentials
    Then The user should be able to login

  Scenario: Login as Jhon Nash
    Given The user is on the login page
    When The user enters Jhon Nash credentials
    Then The user should be able to login

  @smoke
  Scenario: Login as Emel
    Given The user is on the login page
    When The user enters Emel credentials
    Then The user should be able to login

  Scenario: Login as Emine Ceren
    Given The user is on the login page
    When The user enters Emine Ceren credentials
    Then The user should be able to login

  Scenario: Login as Azra
    Given The user is on the login page
    When The user enters Azra credentials
    Then The user should be able to login


  Scenario: User should be able to login with valid credantilas
    Given User should be on the login page
    When User should input login information
    Then User should be on home page
  @wip
      Scenario: Login with parameters
        Given User should be on the login page
        When User should input "alp@gmail.com" and "12345678"
        Then User should be on home page

