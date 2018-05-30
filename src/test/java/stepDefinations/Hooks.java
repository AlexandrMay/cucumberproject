package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before("@SmokeTest")
    public void beforeValidation() {
        System.out.println("SETUPS");
    }

    @After("@SmokeTest")
    public void afterValidation() {
        System.out.println("TEAR DOWN");
    }


}
