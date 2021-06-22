package com.yunjiank.TestNG.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void  teacher1(){
        System.out.println("这是第一个老师");
    }
    public void  teacher2(){
        System.out.println("这是第二个老师");
    }
}
