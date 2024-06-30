Feature: Post Feature of FaceBook
  This will test the post functionality at user wall

  Scenario: Post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type the message in the box
    And Click on the Post button
    Then the message should be posted


