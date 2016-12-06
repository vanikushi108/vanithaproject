@e2e
Feature: log in to connect as an user and perform Borderline Academic case
  AS A User
  I want to raise a Borderline Academic case

  Scenario:Admissions user Raise a Borderline Academic case
    Given I am on the Connect home page
    And I enter user name as "CEG\vkasala"
    And I enter Password as "pwd"
    When I click on signIn
    Then I should see logged in user as "Vanitha Kasala"
    And I search for term "TJ0046"
    And I switch to iFrame "contentIFrame0"
    And I select "Application" under Filter drop down
    When I click on Application "TJ0046"
#   And I switch to iFrame "IFRAME_VC"
#    And I switch to iFrame "contentIFrame0"
    And I click on AddCasesImageButton
    And I select "Borderline Academic" under Case Type drop down
