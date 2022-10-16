package com.bjpowernode;

/**
 * @PROJECT_NAME: maven
 * @DESCRIPTION:
 * @USER: 11240
 * @DATE: 2022/10/13 17:40
 */
public class HelloMaven {
    public int add(int n1, int n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        HelloMaven hello = new HelloMaven();
        int res = hello.add(10,20);
        System.out.println("10+20=" + res);
    }
}
