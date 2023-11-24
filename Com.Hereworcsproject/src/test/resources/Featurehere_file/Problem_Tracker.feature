Feature: Automating Problem Tracker in Hereworcs project


  Scenario:Login page
    Given Launching browser
    When User Entering email
    And User enetring password
    Then User clicking button
    

    
    Scenario: Preview added Problem Tracker details
    Given Clicking menu icon problem tracker
    When Cicking Trackers option in the menu button- problem
    And Click Problem in tracker overview page
    And Click Add problem Tracker
    And Add date - problem Tracker 
    And Select Problem compared to last time
    And Impact of the problem
    And Add Notes
    And Click submit
    