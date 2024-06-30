import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("User should be logged in and should be present on his wall")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
    }

    @When("I type the message in the box")
    public void i_type_the_message_in_the_box() {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
    }
    @When("Click on the Post button")
    public void click_on_the_post_button() {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
    }
        @Then("the message should be posted")
    public void the_message_should_be_posted() {
            System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
        }

}
