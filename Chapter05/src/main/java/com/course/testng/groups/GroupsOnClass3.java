package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "sty")
public class GroupsOnClass3 {

    public void stu1(){
        System.out.println("class3 : stu1");
    }

    public void stu2(){
        System.out.println("class3 : stu2");
    }
}
