@SignUp
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


#    ========== Arrumar seguindo Best practices Cucumber
#  Scenario Outline: The user can sign up
#    Given I am an user in the SignUp page
#    When I enter my "<name>" and  "<password>"
#    And Choose my "<gender>"
#    And Agree on terms and signup
#    Then I can sign up successfully