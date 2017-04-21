package com.browserstack.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.browserstack.cucumber.pages.ProvidentPage;

public class ProvidentStartQuote {
    ProvidentPage providentPage;

    @When("^I click the get a quote button$")
    public void i_click_the_get_a_quote_button() throws Throwable {
    	providentPage.open();
    	providentPage.getQuote();
    }

    @Then("^I should see the Provident title \"([^\"]*)\"$")
    public void matchTitle(String matchTitle) throws Throwable {
        providentPage.titleShouldMatch(matchTitle);
    }
}
