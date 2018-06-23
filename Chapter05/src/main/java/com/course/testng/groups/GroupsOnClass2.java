package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass2 {

    public void teacher3(){
        System.out.println("class2 : teacher3");
    }

    public void teacher4(){
        System.out.println("class2 : teacher4");
    }
}
