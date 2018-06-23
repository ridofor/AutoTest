package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass1 {

    public void teacher1(){
        System.out.println("class1 : teacher1");
    }

    public void teacher2(){
        System.out.println("class1 : teacher2");
    }
}
