Feature: Registrant api test



  Scenario Outline: registrant test
    Given user sets the necessary path params
    And user sets the expected data "<firstname>", "<lastname>" "<SSN>" "<email>" "<username>" "<password>" and "<lan>"
    And user sends the POST request and gets the response
    When user saves the api records to correspondent files
    Then user validates api records

    Examples: api test data
    |firstname|lastname|SSN|email|username|password|lan|
    |Recep    |Aykurt  |293-38-2938|recep@gmail.com|recepaykurt|Recep123.|en|

  @ApiRegistrant
  Scenario:  api get request for users

    Given user sends the get request for users data
    And user deserializes data to Java
    And user saves the users data to correspondent files

    @PutUserRequest
    Scenario: update existing users
      Given user sets the expected user data
      And user makes a put request for users
      And user validates the changes

    @DeleteUser
      Scenario: delete users

        Given user sends the delete request
        Then user validates the deleted user








