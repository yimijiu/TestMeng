package com.yunjiank.TestNG.suite;

import org.testng.annotations.Test;

public class ExceptedException {
    @Test(expectedExceptions = RuntimeException.class)
    public  void  runTimeExceptionFailed(){
        System.out.println("运行时错误");
    }
    //成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public  void  runTimeExceptionSucdessed(){
        System.out.println("成功抛出异常");
        throw new RuntimeException();
    }
}
