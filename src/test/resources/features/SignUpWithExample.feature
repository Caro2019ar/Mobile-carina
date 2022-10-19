@SignUp
Feature: Sign Up Page
  I am a valid user
  Scenario Outline: The user can sign up
    Given I enter my "<name>"
    And Enter "<password>"
    And Select "<gender>"
    When Click on agree
    And Click on signup
    Then Sign up successfully

    Examples:
      | name            | password | gender |
      | Jose da Silva   | 123456   | male   |
      | Dolores Schmidt | pass@123 | female |

