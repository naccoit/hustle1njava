package com.persist.learn.design_patterns.behavior.zerenlian;

/**
 * Created by 张冲 on 2019/11/19.
 */
public class ConcreteHandler extends Handler {

    /**
     * 处理方法
     * 调用此方法处理请求
     */
    @Override
    protected void handleRequest() {


        if(getSuccessor() != null){

            System.out.println("放过请求。。。");
            getSuccessor().handleRequest();

        } else {

            System.out.println("处理请求。。。");
        }
    }
}
