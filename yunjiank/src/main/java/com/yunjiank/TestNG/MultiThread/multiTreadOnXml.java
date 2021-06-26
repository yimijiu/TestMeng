package com.yunjiank.TestNG.MultiThread;

import org.testng.annotations.Test;

public class multiTreadOnXml {
    @Test
    public void test1(){
        System.out.println("Thread id1: "+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("Thread id2: "+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("Thread id3: "+Thread.currentThread().getId());
    }
}
