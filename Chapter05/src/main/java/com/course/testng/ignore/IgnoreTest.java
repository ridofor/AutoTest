package com.course.testng.ignore;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore 1");
    }

    @Test
    public void ignore2(){
        System.out.println("ignore 2");
    }

    @Test(enabled = false)
    public void ignore3(){
        System.out.println("ignore 3");
    }
}
