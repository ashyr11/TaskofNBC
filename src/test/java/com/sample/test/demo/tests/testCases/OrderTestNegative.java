package com.sample.test.demo.tests.testCases;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.tests.pages.OrderPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTestNegative extends TestBase {


    @Test
    public void placeOrder(){
       OrderPage orderPage=new OrderPage(driver);

        Select select=new Select(orderPage.pizza1());
        select.selectByValue("Medium 8 Slices - 2 toppings");

        Select select2=new Select(orderPage.pizza1Toppings1());
        select.selectByIndex(2);

        Select select3=new Select(orderPage.pizza1Toppings2());
        select.selectByIndex(3);

        orderPage.pizza1Quantity().sendKeys("1");

       // orderPage.name().sendKeys("Joe Doe");
        orderPage.email().sendKeys("joedoe@gmail.com");
       // orderPage.phone().sendKeys("3334445555");

        orderPage.radioCreditCard().click();

        orderPage.submit().click();

        String expected="Missing name\n" +
                "Missing phone number";
        String actual=orderPage.dialogText().getText();

        Assert.assertEquals(expected,actual);


        // orderPage.name().sendKeys("Joe");
       //orderPage.submit().click();

    }

//    public OrderPage log;
//
//    @Test
//    public void order() throws InterruptedException {
//        super.initializelDriver();
//        log=new OrderPage(driver);
//        log.placeOrder();
//    }

//    @Test
//    public void orderPizza() throws InterruptedException {
//
//        OrderPage orderPage=new OrderPage();
//       orderPage.placeOrder();
//
//
//
//
//    }
}
