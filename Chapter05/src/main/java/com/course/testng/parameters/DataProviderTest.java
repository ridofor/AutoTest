package com.course.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    //1.通过@Test(dataProvider="name")和@ProviderData(name="name")把参数传递连接起来
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = "+name+", age = "+age);
    }

    //1.可以传多个参数
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }


    //2.根据不同的方法传,run不同的test，结果会不一样哦～
    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test11111: name = "+name+", age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test22222: name = "+name+", age = "+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        //如果是方法1
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"wuyifan",22},
                    {"xiaobai",24}
            };

        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"gutianle",45},
                    {"luidehua",50}
            };
        }

        return result;
    }
}
