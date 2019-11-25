package com.persist.learn.design_patterns.structure.shipeiqi;

/**
 * 类适配器模式
 * 适配器模式 (目标角色)
 * @author 张冲
 * @date 2019/11/25
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void simpleOperate1();

    /**
     * 这是源类Adaptee没有的方法
     */
    void simpleOperate2();
}
