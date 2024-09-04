package com.example.stepdefinitions;

import com.example.pages.RecruitmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RecruitmentSteps {

    WebDriver driver;
    RecruitmentPage recruitmentPage;

    public RecruitmentSteps() {
        this.driver = LoginSteps.driver; 
        recruitmentPage = new RecruitmentPage(driver);
    }

    @When("the user navigates to the recruitment page")
    public void the_user_navigates_to_the_recruitment_page() {
        recruitmentPage.navigateToRecruitment();
    }

    @And("adds a new candidate with first name {string}, last name {string} and email {string}")
    public void adds_a_new_candidate_with_details(String firstName, String lastName, String email) {
        recruitmentPage.clickAddButton();
        recruitmentPage.enterFirstName(firstName);
        recruitmentPage.enterLastName(lastName);
        recruitmentPage.enterEmail(email);
        recruitmentPage.clickSaveButton();
    }

    @Then("the candidate should be added successfully")
    public void the_candidate_should_be_added_successfully() {
        driver.quit();
    }
}
