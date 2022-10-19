@WebViewPage
Feature: WebView Page
  I am a valid user
  Scenario Outline: The app has initiated and user signed up
    Given I enter my '<name>'
    And Enter "<password>"
    And Select "<gender>"
    When Click on agree
    And Click on signup
#  Scenario: The user after sign up can check his profile
    Given I am logged in
    When I open the left menu
    Then I successfully can see my profile

    Examples:
      | name          | password | gender |
      | Jose da Silva | 123456   | male   |