package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MulThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread id %d%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread id %d%n",Thread.currentThread().getId());
    }

}
