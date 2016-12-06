@wip
Feature: log in to connect as an user and perform ComplianceInterview case
  AS A User
  I want to raise a ComplianceInterview case

  Scenario:Admissions user Raise a Compliance Interview case
    Given I am on the Connect home page
    And I enter user name as "CEG\vkasala"
    And I enter Password as "pwd"
    When I click on signIn
    Then I should see logged in user as "Vanitha Kasala"
    And I search for term "TJ0046"
    And I switch to iFrame "contentIFrame0"
    And I select "Application" under Filter drop down
    When I click on Application "TJ0046"
    When I click on AddCasesImageButton
