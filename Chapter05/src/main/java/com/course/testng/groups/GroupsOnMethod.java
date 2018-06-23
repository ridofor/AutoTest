package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void testCase1(){
        System.out.println("testCase1 : server");
    }

    @Test(groups="client")
    public void testCase2(){
        System.out.println("testCase2 : client");
    }

    @Test(groups="client")
    public void testCase3(){
        System.out.println("testCase3 : client");
    }


    @Test(groups = "server")
    public void testCase4(){
        System.out.println("testCase4 : server");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("before groups on server");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("after groups on server");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("before groups on client");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("after groups on client");
    }

}
