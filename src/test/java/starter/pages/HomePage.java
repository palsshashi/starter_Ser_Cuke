package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("http://localhost:9090/gameoflife/home")
public class HomePage extends GameOfLifePage {

    @FindBy(linkText = "New GamZe")
    WebElement newGameLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNewGameLink() {
        newGameLink.click();
    }
}
