package com.persist.learn.design_patterns.structure.shipeiqi;

/**
 * 适配器类
 * @author 张冲
 * @date 2019/11/25
 */
public class Adapter_Class extends Adaptee implements Target {


    @Override
    public void simpleOperate2() {
        System.out.println("这是类适配器补充的方法: simpleOperate2(..)");
    }
}
