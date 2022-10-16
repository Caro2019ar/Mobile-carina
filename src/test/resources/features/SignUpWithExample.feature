Feature: Sign Up Page

  Scenario Outline: The user can sign up
    Given Enter your "<name>"
    Given Enter "<password>"
    Given Select "<gender>"
    Given Click on agree
    Given Click on signup
    Then Sign up successfully

    Examples:
      | name            | password | gender |
      | Jose da Silva   | 123456   | male   |
      | Dolores Schmidt | pass@123 | female |
