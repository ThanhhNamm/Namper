#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Contact Setup

  @tag1
  Scenario: [Contact Setup] It should be able to edit information in this page
    Given Signin to ERBS with ADMIN account
    Then Homepage should be displayed
    When Click on Avatar and Select Administration option
    Then 'User Management screen' page is displayed
    When Click on 'Contact Setup' tab
    Then 'Contact Setup' page should be displayed
    When Update data of module index 1
      | Field       | Data       |
      | EXPERT USER | ERBS.SSO   |
      | EXPERT USER | Stag.SSO   |
      | EXPERT USER | Stag.SSO01 |
    And Click 'Save Change' button
    And Click on 'Ok' button
    Then 'Successfully saved' message should be displayed
    And The module of index 1 should have user as displayed
      | ERBS.SSO   |
      | Stag.SSO   |
      | Stag.SSO01 |
    
   