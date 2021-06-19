package com.yunjiank.TestNG.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public  void  beforeSuite(){
        System.out.println("beforeSuite运行成功");
    }
    @AfterSuite
    public  void  afterSuite(){
        System.out.println("afterSuite运行成功");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行");
    }
    @AfterTest
    public void  afterTest(){
        System.out.println("aftetTest运行");
    }
}
