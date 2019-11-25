package com.persist.learn.design_patterns.structure.shipeiqi;

/**
 * 模拟客户端调用
 * @author 张冲
 * @date 2019/11/26
 */
public class Client
{

    public static void main(String[] args) {
        Target t1 = new Adapter_Class();
        t1.simpleOperate1();
        t1.simpleOperate2();

        System.out.println("===========================================");

        Target t2 = new Adapter_Object(new Adaptee());
        t2.simpleOperate1();
        t2.simpleOperate2();
    }
}
