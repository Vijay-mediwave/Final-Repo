Feature: Automating Mood Tracker in Hereworcs project


  Scenario: Automating Login page
    Given Launching browser
    When User Entering email
    And User enetring password
    Then User clicking button
    
    
    Scenario: Automating Mood Tracker
    Given Clicking menu button
    When Cicking Trackers option in menu button
    And Click Mood  in tracker overview page
    And click Add my Mood Information
    And Click Calendar
    And Select Date 
    And Select How are you feeling today
    And Select compare previous mood entry
    And Enter Notes 
    Then Click record Mood
    
    Scenario: Automating editing and deleting the added Mood tracker
    Given Click month in Mood
    When click Year in Mood
    And Click edit 	In Mood
    And change how are you feeling today
    And click update record Mood
    Then Delete the addedd Mood entry 
    
    #Scenario:Changing passsword
    #Given click name icon
    #When Clicking Account button
    #And click security in account module 
    #And Enter current password
    #And enter New password and confirm password
    #Then click save button
    
    #Scenario: Automating Sleep Tracker pge
    #Given Clicking menu button
    #When cicking Trackers option in menu button
    #And click sleep  in tracker overview page
    #And click Add Sleep Information
    #And select Date 
    #And Select Time From
    #And Select Time upto
    #And select how many time wake up
    #And click Average
    #Then Click record sleep
    
    #Scenario: Automating edit and delete the added tracker
    #Given Click month
    #When click Year
    #And Click edit 	
    #And change how many times did u wake up
    #And click update sleep
    #Then Delete the addedd entry 
        #
    
    