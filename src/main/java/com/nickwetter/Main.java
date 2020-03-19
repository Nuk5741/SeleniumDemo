package com.nickwetter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class Main
{


    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        System.setProperty("webdriver.safari.driver", "webdrivers/safaridriver");


        WebDriver ffdriver = new FirefoxDriver();
        WebDriver gcdriver = new ChromeDriver();
        WebDriver sdriver = new SafariDriver();

    }
}