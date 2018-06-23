package com.course.testng.dependtest;


import org.testng.annotations.Test;

/*
依赖测试
test2 依赖于 test2
@Test(dependsOnMethods = {"testname"})
如果test1运行错误，则师姐跳过test2
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }
}
