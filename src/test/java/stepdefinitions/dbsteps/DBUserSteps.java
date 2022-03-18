package stepdefinitions.dbsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;
import java.util.Map;

public class DBUserSteps {


    @Given("user sends the query {string} to DB")
    public void user_sends_the_query_to_db(String query) {
        List<Map< String, Object>> actualMapData = DatabaseUtility.getQueryResultMap(query);


        List<String> columnNames = DatabaseUtility.getColumnNames(query);
        System.out.println(columnNames);
        //     1, 2, 3
//        for(int j=0; j<columnNames.size();j++){
//        for (int i=0; i < actualMapData.size(); i++){
//            //                                           id, first_name, last_name, birth_date
//            System.out.println(actualMapData.get(i).get(columnNames.get(j)));
//        }}


//        String data = DatabaseUtility.getCellValuewithRowsAndCells(query,5,3).toString();
//        System.out.println(data);



    }

    @Given("user saves users'  data in correspondent files")
    public void user_saves_users_data_in_correspondent_files() {

    }

    @Then("user validates the users data")
    public void user_validates_the_users_data() {

    }

}
