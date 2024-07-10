
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStps{

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        System.out.println("user_is_on_login_page");
    }
    @When("user enters user name and password")
    public void user_enters_user_name_and_password() {
        System.out.println("user_is_on_login_page");
    }
    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("user_is_on_login_page");
    }
    @Then("User is navigated  to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("user_is_on_login_page");
    }


}
