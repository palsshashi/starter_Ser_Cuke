Feature: Home page should display some message

  Scenario: Home page should display Welcome message
    #Given Player has gameOfLife available
    When Player opens home page
    Then Player should see title of "The Game Of Life"