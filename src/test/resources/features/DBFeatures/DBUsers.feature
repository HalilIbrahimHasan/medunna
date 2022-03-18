Feature: test database




  @DBUsers
  Scenario Outline:  test database users
    Given user sends the query "<query>" to DB
    And user saves users'  data in correspondent files
    Then user validates the users data
    Examples: test data for DB
    |query|
    |Select * from physician|