Feature: Negative Login Test

  @negatifLogin
  Scenario Outline:
    Given User should be on the login page
    When User should input "<userEmail>" and "<password>"
    Then The warning message contains "<message>"


    Examples:
      | userEmail      | password      | message                                              |
      | mike@gmail.com | wrongpassword | Email address or password is incorrect. Please check |
      | mikegmail.com  | wrongpassword | Email address or password is incorrect. Please check |
      | mike@gmail     | wrongpassword | Email address or password is incorrect. Please check |
      | wrongEmail     | mike1234      | Email address or password is incorrect. Please check |
      |                | mike1234      | Please enter your email.                             |
      | mike@gmail.com |               | Please enter your password!                          |
      |                |               | Please enter your password!                          |








