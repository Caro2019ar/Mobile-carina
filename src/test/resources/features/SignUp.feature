Feature: Sign Up Page

  Scenario: The user can sign up
    Given Enter name
    Given Enter password
    Given Select gender
    Given Click on agree
    Given Click on signup
    Then Sign up successfully