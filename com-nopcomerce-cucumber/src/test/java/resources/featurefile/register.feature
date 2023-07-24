@regression
Feature: Register Test of Nopcommerce
  As a user I want to check Register functionality

  @sanity
  Scenario: User should navigate to Register page successfully
    Given I am on home page
    When I click on register link
    Then I should see the Register text "Register"


  @sanity
  Scenario: User should verify the mandatory field
    Given I am on home page
    When I click on register link
    And I click on register button
    Then I should see the fist name error "First name is required."
    And I should see the Last name error "Last name is required."
    And I should see the email error "Email is required."
    And I should see the password error "Password is required."
    And I should see the confirm password error "Password is required."

  @smoke
  Scenario: User should register successfully
    Given I am on home page
    When I click on register link
    And I select gender Female
    And I enter first name "Kalu"
    And I enter last name "Kapu"
    And I select date "20"
    And I select month "March"
    And I select year "2000"
    And I enter email "kalu@gmail.com"
    And I enter password "Kalu@9999"
    And I enter confirm password "Kalu@9999"
    And I click on register button
    Then I should register successfully "Your registration completed"