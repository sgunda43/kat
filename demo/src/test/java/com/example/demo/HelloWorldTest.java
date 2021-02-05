package com.example.demo;


import com.example.demo.models.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


@RunWith(JUnit4.class)
public class HelloWorldTest {


    @Test
    public void testHomePage() throws IOException {

        ReadJson readJson = new ReadJson();
        // Here we will get the configuration for different things like Headbands etc.
        Response att = ReadJson.getCMSConfig();

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.att.com/");
        String headerTab = driver.findElement(By.xpath("//*[@id=\"HEADBAND00\"]/span/a/span")).getText();

        Assert.assertEquals("Deals", headerTab);
        driver.close();

    }

}

