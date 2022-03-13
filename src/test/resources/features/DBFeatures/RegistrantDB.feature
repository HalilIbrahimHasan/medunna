Feature: DB Registrants tests




  Background: db connection set up
    Given user creates a connection with DB using "jdbc:postgresql://medunna.com:5432/medunna_db" and "medunnadb_user" , "Medunnadb_@129"

    @DBTest
    Scenario Outline:  db validations
      Given user sends the query to DB and gets the column data "<query>" and "<columnName>"
      And user saves the DB records to correspondent files
      Then user validates DB Registrant data

      Examples: test data
      |query|columnName|
      |Select * from jhi_user|ssn|
