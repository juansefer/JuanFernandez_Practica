package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
    WebDriver driver;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By recruitmentMenu = By.id("menu_recruitment_viewRecruitmentModule");
    By addButton = By.id("btnAdd");
    By firstNameField = By.id("addCandidate_firstName");
    By lastNameField = By.id("addCandidate_lastName");
    By emailField = By.id("addCandidate_email");
    By saveButton = By.id("btnSave");

    // Methods
    public void navigateToRecruitment() {
        driver.findElement(recruitmentMenu).click();
    }

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }
}
