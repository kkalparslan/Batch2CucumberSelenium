@login
Feature: Krafttech Log in Test

  Background:
    Given User should be on the login page

  @smoke
  Scenario: Login as Alparslan
    When The user enters Alparslan credentials
    Then The user should be able to login

  @rerun
  Scenario: Login as Jhon Nash
    When The user enters Jhon Nash credentials
    Then The user should be able to login

  @rerun
  Scenario: Login as Emel
    When The user enters Emel credentials
    Then The user should be able to login

    @QA
  Scenario: Login as Emine Ceren
    When The user enters Emine Ceren credentials
    Then The user should be able to login

      @Developer
  Scenario: Login as Azra
    When The user enters Azra credentials
    Then The user should be able to login

  @db
  Scenario: User should be able to login with valid credantilas
    When User should input login information
    Then User should be on home page

  @db
  Scenario: Login with parameters
    When User should input "alp@gmail.com" and "12345678"
    Then User should be on home page


  Scenario: Login as a given user
    Then User should input following credantials
      | email    | alp@gmail.com |
      | password | 12345678      |
      | Name     | Alparslan     |

  Scenario Outline: Data table and scenario outline
    Then User should input following credantials

      | email    | <userEmail> |
      | password | <password>  |
      | Name     | <name>      |

    Examples:
      | userEmail               | password   | name           |
      | user22@test.com         | Test123456 | User22         |
      | eddiem@kraft.com        | eddiem12   | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman   | Morgan Freeman |
