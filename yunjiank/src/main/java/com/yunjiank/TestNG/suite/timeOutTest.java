package com.yunjiank.TestNG.suite;

import org.testng.annotations.Test;

public class timeOutTest {
    @Test(timeOut = 3000)
    public void  test() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void  test2() throws InterruptedException {
        Thread.sleep(3000);
    }
}
