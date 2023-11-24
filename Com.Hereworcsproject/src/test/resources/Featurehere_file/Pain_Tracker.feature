Feature: Automating Pain Tracker in Hereworcs project


  Scenario: Automating Login page
    Given Launching browser
    When User Entering email
    And User enetring password
    Then User clicking button
    
    
    Scenario: Automating Pain Tracker
    Given Clicking menu icon 
    When Cicking Trackers option in the menu button pain
    And Click Pain in tracker overview page
    And Click Calendar- pain
    And Select Date- pain
    And Select Pain severity rating
    And Select types ofpain
    And Selct Location 
    Then Click Submit-pain
    
    Scenario: Preview Pain Graph
    Given Click View Graph- pain
    When Select Day field- pain