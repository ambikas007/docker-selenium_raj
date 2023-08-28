package pageobjetcs_newtoors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;


    public FlightDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "passCount")
    private WebElement passengers;

    @FindBy(name = "findFlights")
    private WebElement submitBtn;

    public void selectPassengers(String noOfPassengers){
        this.wait.until(ExpectedConditions.elementToBeClickable(passengers));
        Select select = new Select(passengers);
        select.selectByValue(noOfPassengers);
    }

    public void goToFindFlightsPage(){
        this.submitBtn.click();
    }



}
