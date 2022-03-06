package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigurationReader;

public class Medunna_Base_Url {


    //
    protected RequestSpecification spec;

    @Before
    public void setup(){

        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();


    }


}
