package com.flight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#navbarSupportedContent > ul > li:nth-child(4) > a")
    public WebElement SingIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "body > app-root > div > app-login > div > div > div > form > div:nth-child(3) > input")
    public WebElement Login;

    @FindBy(css = "body > app-root > div > app-login > div > div > div > form > div.alert.alert-danger > div")
    public WebElement errorMessage;

    @FindBy(id = "search-query")
    public WebElement SearchBox;

    @FindBy(xpath = "//*[@id=\"filters\"]/form[2]/div/button[2]")
    public WebElement SearchBtn;

    @FindBy(xpath = "/html/body/app-root/div/app-overview/div[3]/div[2]/h3")
    public WebElement SearchResult;

    @FindBy(id = "language")
    public WebElement Language;

    @FindBy(id = "dropdown-animated")
    public WebElement dropdown;



    public void clickSingIn() {
        SingIn.click();
    }

    public void addEmailPassword(String emailStr, String passwordStr) {
        email.sendKeys(emailStr);
        password.sendKeys(passwordStr);
    }


    public void clickLogIn() {
        Login.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void addTool(String tool) {
        SearchBox.sendKeys(tool);
    }

    public void clickSearchBtn() {
        SearchBtn.click();
    }

    public String getSearchResult() {
        return SearchResult.getText();
    }

    public void clickLanguage() {
        Language.click();
    }

    public String getLanguage() {
        return Language.getText();
    }

    public void dropdownMenu(String value) {

        List<WebElement> dropdownMenus = dropdown.findElements(By.tagName("li"));

        for (WebElement option : dropdownMenus) {
            if (option.getText().equals(value)) {
                option.click();
            }
        }
    }

}
