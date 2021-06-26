package com.yunjiank.TestNG.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvider1 {
    @Test(dataProvider = "data")
    public  void providerTest(String name,int age){
        System.out.println("name: "+name+";age: "+age);
    }
    @DataProvider(name ="data")
    public  Object[][] providerData(){
        Object[][] O =new Object[][]{
                {"zhangsan",20},
                {"lisi",10},
                {"wangwu",5}

        };
        return O;
    }

    @Test(dataProvider="provideMethod")
    public  void  methodprovidetest1(String name,int age){
        System.out.println("test22"+"name: "+name+";age: "+age);
    }
    @Test(dataProvider="provideMethod")
    public  void  methodprovidetest2(String name,int age){
        System.out.println("test222"+"name: "+name+";age: "+age);
    }
    @DataProvider(name="provideMethod")
    public Object[][] dataPrividerMethon(Method method){
        Object[][] result = null;
        if(method.getName().equals("methodprovidetest1")){
            result = new Object[][]{
                    {"安安",25},
                    {"乐乐",25}

            };
        }else if(method.getName().equals("methodprovidetest2")){
            result = new Object[][]{
                    {"蕾蕾",18},
                    {"周周",19}
            };
        }
        return result;
    }

}
