package com.course.testng;

import org.testng.annotations.*;

/*
记住执行顺序 BeforeSuite--BeforeClass--BeforeMethod--Test--AfterMethod--AfterClass
--AfterSuite
 */

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    //在每一个方法之前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method,这是在每一个测试方法之前运行的");
    }

    //在每一个方法之后运行
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method，这是在每一个测试方法之后运行的");
    }

    //在类运行之前运行
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class,这是在类运行之前运行的方法");
    }

    //在类运行之前运行
    @AfterClass
    public void afterClass(){
        System.out.println("after class,这是在类运行之后运行的方法");
    }

    //在所有标签之前运行
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite,测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite,测试套件");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
}
