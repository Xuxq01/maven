package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @PROJECT_NAME: maven
 * @DESCRIPTION:
 * @USER: 11240
 * @DATE: 2022/10/13 17:41
 */
public class TestHelloMaven {

    @Test
    public void testAdd(){

        System.out.println("======testAdd测试add方法");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10,20);
        //判断结果是否正确
        Assert.assertEquals(30,res);
    }
    @Test
    public void testAdd2(){

        System.out.println("======testAdd2测试add方法");
        HelloMaven hello = new HelloMaven();
        int res = hello.add(30,20);
        //判断结果是否正确
        Assert.assertEquals(50,res);
    }
}
