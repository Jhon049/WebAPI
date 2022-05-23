package co.com.sofka.stepdefinitions;

import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class ServiceSetUp {
    protected static final String BASE_URI = "https://www.etnassoft.com/api/v1";
    protected static final String BASE_PATH = "/get/?any_tags=[html,css,javascript]&amp;order=newest";

    protected void generalSetUp(){
        setUpLog4j2();
        setUpBases();
    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(System.getProperty("user.dir")  + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    private void setUpBases(){
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
    }
}