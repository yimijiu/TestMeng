package com.yunjiank.TestNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("这是第一个学生");
    }

    public void  stu2(){
        System.out.println("这是第二个学生");
    }
}
