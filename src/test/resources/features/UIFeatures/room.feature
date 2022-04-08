
Feature:Room creation with Admin
  @UIRoom
  Scenario Outline:Create_room_UI
    Given admin navigates to Medunna web site
    And   admin clicks on sign in and enter username "<username>" and password "<password>"
    And   admin clicks items dropdown and click Room
    And   admin clicks create a new room button
    And   admin enters room number "<room_number>", price "<price>" and select the room type as SUITE
    And   admin hit the save button
    Then  verify the room creation
    Examples:

      | username | password    | room_number |price|
      | Admin80  | Welcome123! | 8881        |2000 |


