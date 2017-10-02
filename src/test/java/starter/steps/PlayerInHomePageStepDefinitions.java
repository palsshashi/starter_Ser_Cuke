package starter.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class PlayerInHomePageStepDefinitions {
	
    @Managed(driver="chrome")
    WebDriver driver;

    @ManagedPages(defaultUrl = "http://localhost:9090")
    public Pages pages;

    @Steps
    PlayerStepscommon player;
    
    



@When("^Player opens home page$")
public void player_opens_home_page() throws Throwable {
	player.opens_home_page();
    //throw new PendingException();
}

@Then("^Player should see title of \"([^\"]*)\"$")
public void player_should_see_title_of(String arg1) throws Throwable {
	player.should_see_title_of(arg1);
    //throw new PendingException();
}
}
