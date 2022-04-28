Feature: Room creation with



@APIRoom
Scenario:  Create_room_API

Given user sets the necessary path params
And   user sends the get request for users data
And   user deserializes data to Java
And   user saves the users data to correspondent files
Then  user validates created a room
