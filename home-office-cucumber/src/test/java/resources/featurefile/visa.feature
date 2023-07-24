@regression
Feature: Visa check Test
  As a user I want to check required visa status
@smoke
  Scenario: User should check the visa required or not
    Given I am on home page
    When I accept the cookies
    And I click on hide button
    And I click on start button
    And I select nationality "Australia"
    And I click on next step button
    And I select reason for visit "Tourism or visiting family and friends"
    And I click on continue button
    Then I should see the visa messageOne

@sanity
  Scenario: User should check the visa required or not
    Given I am on home page
    When I accept the cookies
    And I click on hide button
    And I click on start button
    And I select nationality "Chile"
    And I click on next step button
    And I select reason for visit "Work, academic visit or business"
    And I click on next steps button
    And I select stay for longer than six months "2"
    And I click on continues button
    And I select health work visa option "Health and care professional"
    And I click on next continue button
    Then I should see the visa messageTwo
@smoke
  Scenario: User should check the visa required or not
    Given I am on home page
    When I accept the cookies
    And I click on hide button
    And I click on start button
    And I select nationality "Congo"
    And I click on next step button
    And I select reason for visit "Join partner or family for a long stay"
    And I click on next steps button
    And I click on Yes button
    And I click on next button
    Then I should see the visa messageThree





