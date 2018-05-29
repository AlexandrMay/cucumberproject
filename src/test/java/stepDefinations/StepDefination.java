package stepDefinations;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import java.util.List;


public class StepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_NetBanking_landing_page() throws Throwable {
        System.out.println("success");
    }

    @When("^User login into app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_app_with_username_and_password(String s1, String s2) throws Throwable {
        System.out.println(s1);
        System.out.println(s2);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("3");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed(String s) throws Throwable {
        System.out.println(s);
    }

    @When("^User login into app with following details$")
    public void user_login_into_app_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj = data.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
    }



    @When("^User login into app with \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
    public void user_login_into_app_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Chrome");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("visible");
    }



}