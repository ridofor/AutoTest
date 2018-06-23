package com.course.testng.suite;

import org.testng.annotations.*;

/*
LoginTest 和 PayTest 的公共配置文件
 */

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
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
