package com.yunjiank.TestNG.suite;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public  void  test1(){
        System.out.println("test1 run111");
        throw  new RuntimeException();
    }
    @Test(dependsOnMethods = "test1")
    public  void  test2(){
        System.out.println("test2 run222");
    }
}
