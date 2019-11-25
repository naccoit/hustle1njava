package com.persist.learn.design_patterns.structure.shipeiqi;

/**
 * 对象适配器
 * @author 张冲
 * @date 2019/11/26
 */
public class Adapter_Object implements Target {

    private Adaptee adaptee;

    public Adapter_Object(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源具体角色有的方法,
     * 因此适配器直接委派即可
     */
    @Override
    public void simpleOperate1() {
        this.adaptee.simpleOperate1();
    }


    /**
     * 源角色没有的方法.
     * 因此适配器需要补充此方法
     */
    @Override
    public void simpleOperate2() {
        //相关逻辑代码
        System.out.println("这是对象适配器补充的方法: simpleOperate2(..)");
    }
}
