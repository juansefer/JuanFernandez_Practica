package com.example.stepdefinitions;

import com.example.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

    public static WebDriver driver;
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters username as {string} and password as {string}")
    public void the_user_enters_username_as_and_password_as(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        // Verify redirection to dashboard
        String currentUrl = driver.getCurrentUrl();
        if(!currentUrl.contains("/dashboard")) {
            throw new AssertionError("User is not on the dashboard");
        }
        driver.quit();
    }
}
