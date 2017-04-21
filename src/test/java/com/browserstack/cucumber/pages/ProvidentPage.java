package com.browserstack.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.Assertions.assertThat;


@DefaultUrl("https://www.providentinsurance.co.uk")
public class ProvidentPage extends PageObject {

    @FindBy(id="HomePage_GetQuote")
    WebElementFacade btnGetQuote;


    public void getQuote() throws Exception {
        btnGetQuote.click();
        Thread.sleep(1000);
    }

    public void titleShouldMatch(String matchTitle) {
        assertThat(this.getTitle()).containsIgnoringCase(matchTitle);
    }
}
