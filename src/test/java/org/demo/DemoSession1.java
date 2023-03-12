package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSession1 {

        WebDriver driver;

        @Test
        public void test() {
            //launch chrome browser
            driver = new ChromeDriver();

            //loads google.com on newly launched browsers tab
            driver.get("https://www.google.com");

            //Open a NEW TAB in same window and load 'facebook.com' on this tab
            driver.switchTo().newWindow(WindowType.TAB);

        }


        }





