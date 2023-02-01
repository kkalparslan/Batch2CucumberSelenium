Feature: Navigate to menu with parameter


  Scenario: Harun navigates to Edit Profile menu
    Given User should be on the login page
    When User should input "mike@gmail.com" and "mike1234"
    Then The user name should be "Harun"
    When The user navigates to "Edit Profile" menu
    Then The user should be able to see home name as "Edit User Profile"

  Scenario: Eddie Murphy navigates to Developers menu
    Given User should be on the login page
    When User should input "eddiem@kraft.com" and "eddiem12"
    Then The user name should be "Eddie Murphy"
    When The user navigates to "Developers" menu
    Then The user should be able to see home name as "Developers"


  Scenario: Morgan Freeman navigates to Dashboard menu
    Given User should be on the login page
    When User should input "morganfreeman@kraft.com" and "mfreeman"
    Then The user name should be "Morgan Freeman"
    When The user navigates to "Dashboard" menu
    Then The user should be able to see home name as "Dashboard"

  @rerunWith
  Scenario Outline: Different user <name> navigates to <tab> menu

    Given User should be on the login page
    When User should input "<userEmail>" and "<password>"
    Then The user name should be "<name>"
    When The user navigates to "<tab>" menu
    Then The user should be able to see home name as "<homeName>"

    Examples:
      | userEmail               | password | name            | tab          | homeName          |
      | mike@gmail.com          | mike1234 | HarunHarunHarun | Edit Profile | Edit User Profile |
      | eddiem@kraft.com        | eddiem12 | Eddie Murphy    | Developers   | Developers        |
      | morganfreeman@kraft.com | mfreeman | Morgan Freeman  | Dashboard    | Dashboard         |


