package step_definitions.UI_step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPageElements;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.Driver.waitAndClick;
import static utilities.Driver.waitAndSendText;

public class Room_Step_Definitions {

    CommonPageElements commonPageElements = new CommonPageElements();

    @Given("admin navigates to Medunna web site")
    public void admin_navigates_to_medunna_web_site() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_login_url"));

    }
    @Given("admin clicks on sign in and enter username {string} and password {string}")
    public void admin_clicks_on_sign_in_and_enter_username_and_password(String username, String password) {
        waitAndClick(commonPageElements.dropDown);
        waitAndClick(commonPageElements.loginButton);
        waitAndSendText(commonPageElements.usernameTexBox,username);
        waitAndSendText(commonPageElements.passwordTexBox,password);
        waitAndClick(commonPageElements.singInButton);

    }
    @Given("admin clicks items dropdown and click Room")
    public void admin_clicks_items_dropdown_and_click_room() {

    }
    @Given("admin clicks create a new room button")
    public void admin_clicks_create_a_new_room_button() {

    }
    @Given("admin enters room number {string}, price {string} and select the room type as SUITE")
    public void admin_enters_room_number_price_and_select_the_room_type_as_suite(String string, String string2) {

    }
    @Given("admin hit the save button")
    public void admin_hit_the_save_button() {

    }
    @Then("verify the room creation")
    public void verify_the_room_creation() {

    }

}
