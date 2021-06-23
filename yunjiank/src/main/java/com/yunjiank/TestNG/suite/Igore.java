package com.yunjiank.TestNG.suite;

import org.testng.annotations.Test;

public class Igore {
    @Test
    public  void  igore1(){
        System.out.println("igore1执行了");
    }
    @Test(enabled = false)
    public  void  igore2(){
        System.out.println("igore2执行了");
    }
    @Test(enabled = true)
    public  void  igore3(){
        System.out.println("igore3执行了");
    }
}
