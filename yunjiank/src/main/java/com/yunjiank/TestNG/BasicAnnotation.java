package com.yunjiank.TestNG;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public  void testCase1(){
        System.out.println("这是测试用例1");
    }
    @BeforeMethod
    public  void  beforeMethod(){
        System.out.println("这是测试方法之前执行的");
    }
    @AfterMethod
    public  void  afterMethon(){
        System.out.println("这是测试方法开始之后执行的");
    }
    @Test
    public void  testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public  void  beforeClass (){
        System.out.println("这是class之前运行的");
    }
    @AfterClass
    public  void  afterClass(){
        System.out.println("这是class之后运行的");
    }
    @BeforeSuite
    public  void  beforeSuite(){
        System.out.println("这是suite之前运行的");
    }
    @AfterSuite
    public  void  afterSuite(){
        System.out.println("这是suite之后运行的");
    }
}
