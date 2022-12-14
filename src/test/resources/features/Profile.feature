
Feature: Profile Tests

  Background:
    Given User should be on the login page

  Scenario: User should be able to edit profile
    When User should input login information
    And User should go to My Profile
    And User should go to navigate to "Edit Profile"
    And User should input the information boxes
    Then User should verify profile updated message


  Scenario: User should be able to see profile options
    When User should input "alp@gmail.com" and "12345678"
    Then User should see the profile options
      | Components |
      | Forms      |
      | JavaScript |
      | My Profile |


