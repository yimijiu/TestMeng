package com.yunjiank.TestNG.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethon {
    @Test(groups ="server")
    public void testServer1(){
        System.out.println("这是服务端1");
    }

    @Test(groups ="server")
    public void  testServer2(){
        System.out.println("这是服务端2");
    }

    @Test(groups = "clent")
    public  void  testclent1(){
        System.out.println("这是客户端1");
    }
    @Test(groups = "clent")
    public  void  testclent2(){
        System.out.println("这是客户端2");

    }
    @BeforeGroups("server")
    public void  beforeGroupServer(){
        System.out.println("服务端之前运行的111");
    }
    @AfterGroups("server")
    public  void  afterGroupServer(){
        System.out.println("服务端运行之后的222");
    }
}
