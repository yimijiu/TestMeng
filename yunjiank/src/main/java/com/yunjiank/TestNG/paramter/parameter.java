package com.yunjiank.TestNG.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
    @Test
    @Parameters({"name","age"})
    public  void parameterTest1(String name,int age){
        System.out.println("name=" + name+ ";age="+age);

    }
}