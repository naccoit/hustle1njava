package com.persist.learn.design_patterns.behavior.zerenlian.demo1;

/**
 * Created by 张冲 on 2019/11/19.
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;


    /**
     * 取值方法
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }


    /**
     * 设置下一个请求对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    /**
     * 处理聚餐费用的方法
     * @param user 申请人
     * @param fee 申请金额
     */
    public abstract String handlerFeeRequest(String user, double fee);
}
