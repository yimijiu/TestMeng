package com.yunjiank.TestNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu3(){
        System.out.println("这是第三个学生");
    }

    public void stu4(){
        System.out.println("这是第四个学生");
    }
}
