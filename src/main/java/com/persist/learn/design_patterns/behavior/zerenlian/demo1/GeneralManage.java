package com.persist.learn.design_patterns.behavior.zerenlian.demo1;

/**
 * Created by 张冲 on 2019/11/19.
 */
public class GeneralManage extends Handler {

    @Override
    public String handlerFeeRequest(String user, double fee) {

        String result = "";

        //总经理权限最大,多大的费用都能处理
        if(fee >= 1000){

            //并且只能处理张三的请求
            if ("张三".equals(user)) {
                result = "成功,总经理同意" + user + " 的请求,金额为 " + fee + "元.";
            } else {
                //其他人一律不同意
                result = "失败,总经理不同意" + user + " 的请求,金额为 " + fee + "元.";
            }
        } else {

            //如果还有后续对象,则继续传递处理
            if (getSuccessor() != null) {
                return getSuccessor().handlerFeeRequest(user, fee);
            }
        }

        return result;
    }
}
