package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/ua0822/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //SR-12111
        //Verifying if phone element is present on page
        if(driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"))!= null){
            System.out.println("Element Phones is Present");
        }else{
            System.out.println("Element Phones is not Absent");
        }
        //Verifying if Laptops element is present on page
        if(driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"))!= null){
            System.out.println("Element Laptops is Present");
        }else{
            System.out.println("Element Laptops is not Absent");
        }
        //Verifying if Monitor element is present on page
        if(driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"))!= null){
            System.out.println("Element Monitor is Present");
        }else{
            System.out.println("Element Monitor is not Absent");
        }

        //SR-12120
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[5]/div/div/h4/a")).click();
        //SR-12121
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
        //SR-12130
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a")).click();
        driver.close();

    }
}