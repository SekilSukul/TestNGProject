package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void coklupencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");

        String ilksayfahandle = driver.getWindowHandle();
        System.out.println(ilksayfahandle);

        driver.findElement(By.partialLinkText("Click Here")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Set <String> tumPencereler =  driver.getWindowHandles();
            for (String handle : tumPencereler){
                System.out.println(handle);
            }


        String ikincisayfahandle = (String) ((tumPencereler.toArray())[tumPencereler.size()-1]);
        System.out.println(ikincisayfahandle);

        driver.switchTo().window(ilksayfahandle);



    }


}
