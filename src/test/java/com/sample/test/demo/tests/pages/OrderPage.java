package com.sample.test.demo.tests.pages;

import com.sample.test.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends TestBase {



    WebDriver driver;

    public OrderPage(WebDriver driver){
        this.driver=driver;
    }

    private By pizza1=By.id("pizza1Pizza");
    private By pizza1Toppings1=By.className("toppings1");
    private By pizza1Toppings2=By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
    private By pizza1Quantity=By.id("pizza1Qty");
    private By name= By.id("name");
    private By email= By.id("email");
    private By phone= By.id("phone");
    private By radioCreditCard=By.id("ccpayment");
    private By submit=By.id("placeOrder");
    private By dialog=By.id("dialog");
    private By dialogText=By.xpath("//div[@id='dialog']/p");


    public WebElement pizza1(){
        return driver.findElement(pizza1);
    }

    public WebElement pizza1Toppings1(){
        return driver.findElement(pizza1Toppings1);
    }

    public WebElement pizza1Toppings2(){
        return driver.findElement(pizza1Toppings2);
    }

    public WebElement pizza1Quantity(){
        return driver.findElement(pizza1Quantity);
    }

    public WebElement name(){
        return driver.findElement(name);
    }

    public WebElement email(){
        return driver.findElement(email);
    }

    public WebElement phone(){
        return driver.findElement(phone);
    }

    public WebElement radioCreditCard(){
        return driver.findElement(radioCreditCard);
    }

    public WebElement submit(){
        return driver.findElement(submit);
    }

    public WebElement dialog(){
        return driver.findElement(dialog);
    }

    public WebElement dialogText(){
        return driver.findElement(dialogText);
    }
}



