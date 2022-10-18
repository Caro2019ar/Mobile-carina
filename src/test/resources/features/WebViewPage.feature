Feature: WebView Page

#  Background: The app has initiated and user signed up

  Scenario Outline: The user after sign up can check his profile
    Given Enter your "<name>"
    Given Enter "<password>"
    Given Select "<gender>"
    Given Click on agree
    Given Click on signup
    Given I am logged in
    When I open the left menu
    Then I successfully can see my profile

    Examples:
      | name            | password | gender |
      | Jose da Silva   | 123456   | male   |
