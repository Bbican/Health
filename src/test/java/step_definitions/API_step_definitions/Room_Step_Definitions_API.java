package step_definitions.API_step_definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import pojos.Room_Response;
import utilities.ConfigurationReader;

import java.io.IOException;

import static Hooks.Hooks.spec;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class Room_Step_Definitions_API {
    Response response;
    Room_Response room_response = new Room_Response();


    @Given("user sets the necessary path params")
    public void user_sets_the_necessary_path_params() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
        spec.pathParams("first", "api", "second", "rooms");

    }
    @Given("user sends the get request for users data")
    public void user_sends_the_get_request_for_users_data() {
        response = getRequest(generateToken(), ConfigurationReader.getProperty("rooms_endpoint"));
        response.prettyPrint();

    }
    @Given("user deserializes data to Java")
    public void user_deserializes_data_to_java() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        room_response = obj.readValue(response.asString(), Room_Response.class);
        System.out.println(room_response);
//        for (int i = 0; i < appointment_apis.length; i++) {
//            if (appointment_apis[i].getPatient() != null) {//to ignore the null ones
//                System.out.println("Name: " + appointment_apis[i].getPatient().getFirstName());
//                System.out.println("LastName: " + appointment_apis[i].getPatient().getLastName());
//                System.out.println("Patient ID: " + appointment_apis[i].getPatient().getId());
//                System.out.println("App Start Date: " + appointment_apis[i].getStartDate());
//                System.out.println("App End Date: " + appointment_apis[i].getEndDate());
//
//                if (appointment_apis[i].getPatient().getUser() != null)//to ignore the null ones
//                    System.out.println("SSN: " + appointment_apis[i].getPatient().getUser().getSsn());
//            }
//        }


    }
    @Given("user saves the users data to correspondent files")
    public void user_saves_the_users_data_to_correspondent_files() {
    //    saveAppointmentAPIData(fileName, appointment_apis);

    }
    @Then("user validates created a room")
    public void user_validates_created_a_room() {

    }



}
