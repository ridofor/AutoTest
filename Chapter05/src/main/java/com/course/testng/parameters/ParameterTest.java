package com.course.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
参数测试
@Parameters({"参数名称1","参数名称2"})
参数的value在配置文件parameter.xml中配置
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name, int age){
        System.out.println("name = "+name + " , age = " + age);
    }
}
