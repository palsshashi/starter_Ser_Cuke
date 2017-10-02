Feature: Start a new game

Scenario: Go to new game 
    Given Player opens home page
    When Player chooses to start a new game
    Then player should see the page containing text "The Game!"

Scenario: create a new game
    Given Player opens home page
    When Player chooses to start a new game
    Then player should see grid EMPTY_GRID
    When Player clicks on cell at 1,1
    When Player starts simulation
    Then player should see grid EXPECTED_GRID 
    
    
