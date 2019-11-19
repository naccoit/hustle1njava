package com.persist.learn.design_patterns.behavior.zerenlian.demo1;

/**
 * 客户端类
 * Created by 张冲 on 2019/11/19.
 */
public class Client {

    public static void main(String[] args) {

        Handler handler1 = new ProjectManage();

        Handler handler2 = new DeptManage();

        Handler handler3 = new GeneralManage();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        //test1
        String test1 = handler1.handlerFeeRequest("张三",300);
        System.out.println("test1 = " + test1);
        String test2 = handler1.handlerFeeRequest("李四",300);
        System.out.println("test2 = " + test2);

        System.out.println("=====================================================");

        //test2
        String test3 = handler1.handlerFeeRequest("张三",700);
        System.out.println("test3 = " + test3);
        String test4 = handler1.handlerFeeRequest("李四",700);
        System.out.println("test4 = " + test4);

        System.out.println("=====================================================");

        //test3
        String test5 = handler1.handlerFeeRequest("张三",1250);
        System.out.println("test5 = " + test5);
        String test6 = handler1.handlerFeeRequest("李四",1250);
        System.out.println("test6 = " + test6);
    }
}
