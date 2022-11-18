Feature: CreateOrganizatio

  Background: 
    As a launch a browser
    I will enter the url


  @arshad
  Scenario: User should login and create a organization with mandatory field
    And In login page I will enter username "admin" and password "admin" and click on login button
    When In homepag click on organizations link
    And In organization page click on new org image
    And In create new org page enter mandatory fields click on save button
    Then Verify org created or not

  @arshad
  Scenario Outline: User should login and create a organization with given field
    And In Login page enter username "admin" and password "admin" and click on login button
    When In Homepag click on organization link
    And In Organizations page click on new org image
    And In create new org page enter "<orgName>" and "<email>" and click on save button
    Then Verify org "<orgName>" is created or not properly

    Examples: 
      | orgName | email              |
      | google  | google12@gmail.com |
      | firefox | firfox12@gmail.com |
