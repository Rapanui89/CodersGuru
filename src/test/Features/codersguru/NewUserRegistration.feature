Feature: registering the correct private user

  Scenario: Create new private user
    Given I open coders guru website
    When I go to registrations page
    And I select private user
    And I enter email test@test.pl
    And I enter name "Jan" surname "Kowalski"
    And I provide password "lubieplacki12"
    And I provide address "Wroclaw" "50-100" "Rzeznicza" "44"
    And I check that I have read button
    And I click registration button
    Then User should be successfully created




