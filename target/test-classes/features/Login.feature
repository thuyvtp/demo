Feature: Login


  Scenario: Login seller center
    Given User open a page "https://sellercenter-box2.dev.tiki.services/new/#/user/login"
    When user input correct email
    And  user input correct password
    Then Verify user login success

    
    
    
    