Feature: End To End test



  @EndToEnd
    @UIRegistration
  Scenario Outline: test registration
    Given user provides ssn id "<SSN>"
    And  user provides firstname and lastname "<firstname>" and "<lastname>"
    Then user creates username "<username>"
    And user provides also email "<email>"
    And user generates the password "<password>"
    And user registers and validates
    Then user creates the records to a correspondent file
    Given user sends the query to DB and gets the column data "<query>" and "<columnName>"
    And user saves the DB records to correspondent files
    And user gets DB records and validates the ssn
    Examples: test data
      |SSN|firstname|lastname|username|email|password|query|columnName|
      |384-37-3827|Irfan|Pishkin|irfanpish|irfan@gmail.com|asdfA123.|Select * from jhi_user|ssn|
