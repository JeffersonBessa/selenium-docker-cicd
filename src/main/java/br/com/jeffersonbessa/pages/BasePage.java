package br.com.jeffersonbessa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class BasePage {

    public static final String FLIGHT_RESERVATION_URL = "https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html";
    public static final String VENDOR_PORTAL_URL = "https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html";
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isAt();
}
