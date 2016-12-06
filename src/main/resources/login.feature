@login
Feature: log in to connect as an user and perform Borderline Academic case
  AS A User
  I want to raise a Borderline case

  Scenario:Admissions user Raise a Compliance Interview case
    Given I am on the Connect home page
    And I enter user name as "CEG\vkasala"
    And I enter Password as "pwd"
    When I click on signIn
    Then I should see logged in user as "Vanitha Kasala"
