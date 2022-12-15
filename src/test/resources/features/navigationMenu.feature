@review
Feature: Krafttech Dashboard Test

  Scenario: Login as Mike
    Given The user is on the login page
    When Get the text of dashboard
    And Go to Developers menu
    And Get the text of Developer
    Then Verify that text is developer

  Scenario: Login as Sebastian
    Given The user is on the login page
    When Get the text of dashboard
    And Go to Edit Profile menu
    And Get the text of Edit User Profile
    Then Verify that text is Edit User Profile

  Scenario: Login as Jhon Nash
    Given The user is on the login page
    When Get the text of dashboard
    And Go to My Profile menu
    And Get the text of User Profile
    Then Verify that text is User Profile



    # Create new feature file navigationMenu.feature and write
    #    scenarios for given requirements and test case.
    #    Try to reuse steps from previous feature file.
    #    After finishing the scenarios , add necessary tags, run
    #    though Cukes Runner and generate step defs.
    #
    #        Scenario 1:
    #    Login as Mike
    #    At first get the text of dashboard
    #    Then go to Developers menu and get the text of Developer
    #
    #        Scenario 2:
    #    Login as Sebastian
    #    Get the text of dashboard
    #    Then go to Edit Profile menu and get the text of Edit User Profile
    #
    #        Scenario 3:
    #    Login as Jhon Nash
    #    Get the text of dashboard
    #    Then go to My Profile menu and get the text of User Profile
    #
    #    -Write scenarios
    #    -Create step definitions
    #    -No need to use any JAVA code.
    #    -Just implement the step definitions by adding print statement.
    #    -Create new class NavigationMenuStepDefs