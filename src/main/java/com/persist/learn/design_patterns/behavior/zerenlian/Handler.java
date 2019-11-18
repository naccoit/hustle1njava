package com.persist.learn.design_patterns.behavior.zerenlian;

/**
 * 责任链模式：
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 *
 * Created by 张冲 on 2019/11/18.
 */
public abstract class Handler {

    /**
     * 持有后继的责任对象
     */
    protected Handler successor;

    /**
     * 示意处理请求的方法，这个方法目前是没传入参数，实际是可以传入参数的，根据具体情况而定
     */
    protected abstract void handleRequest();


    /**
     * 取值方法
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
