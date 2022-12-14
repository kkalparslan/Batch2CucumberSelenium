Feature: Account Type


  Scenario: first user
    Given User should be on the login page
    When User should input "mike@gmail.com" and "mike1234"
    Then The user name should be "Harun"

  Scenario: Second user
    Given User should be on the login page
    When User should input "eddiem@kraft.com" and "eddiem12"
    Then The user name should be "Eddie Murphy"

  Scenario: Third user
    Given User should be on the login page
    When User should input "morganfreeman@kraft.com" and "mfreeman"
    Then The user name should be "Morgan Freeman"

  Scenario: fourth user
    Given User should be on the login page
    When User should input "krafttech@kraft.com" and "Test1234"
    Then The user name should be "Kyle Masters"


  Scenario Outline: Different <name> user type
    Given User should be on the login page
    When User should input "<userEmail>" and "<password>"
    Then The user name should be "<name>"

    Examples:
      | userEmail               | password | name           |
      | mike@gmail.com          | mike1234 | Harun          |
      | eddiem@kraft.com        | eddiem12 | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman | Morgan Freeman |
      | krafttech@kraft.com     | Test1234 | Kyle Masters   |
