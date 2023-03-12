package org.demo.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "text1")
    WebElement textElement1;

    @FindBy(id = "text2")
    WebElement textElement2;
}
