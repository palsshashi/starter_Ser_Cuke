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

public class WhenUserEntersInitialGridStepDefinitions {

	//@Managed(driver="chrome",uniqueSession = true)
	@Managed(driver="chrome")
    WebDriver driver;

    @ManagedPages(defaultUrl = "http://localhost:9090")
    public Pages pages;

    @Steps
    PlayerStepscommon player;


    final static String[][] EMPTY_GRID
            = new String[][]{{"", "", ""},
            {"", "", ""},
            {"", "", ""}};
            
     String[][] expectedGrid = new String[][]{{".", ".", "."},
                {".", "*", "."},
                {".", ".", "."}};



@When("^Player chooses to start a new game$")
public void player_chooses_to_start_a_new_game() throws Throwable {
	player.chooses_to_start_a_new_game();
    //throw new PendingException();
}

@Then("^player should see grid EMPTY_GRID$")
public void player_should_see_grid_EMPTY_GRID() throws Throwable {
	 player.should_see_grid(EMPTY_GRID);
    //throw new PendingException();
}
@Then("^player should see the page containing text \"([^\"]*)\"$")
public void player_should_see_the_page_containing_text(String arg1) throws Throwable {
	player.should_see_a_page_containing_text(arg1);
    //throw new PendingException();
}

@When("^Player clicks on cell at (\\d+),(\\d+)$")
public void player_clicks_on_cell_at(int arg1, int arg2) throws Throwable {
	player.clicks_on_cell_at(arg1, arg2);
    //throw new PendingException();
}

@When("^Player starts simulation$")
public void player_starts_simulation() throws Throwable {
	 player.starts_simulation();
    //throw new PendingException();
}
@Then("^player should see grid EXPECTED_GRID$")
public void player_should_see_grid_EXPECTED_GRID() throws Throwable {
	player.should_see_grid(expectedGrid);
    //throw new PendingException();
}





}