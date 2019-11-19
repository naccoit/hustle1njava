package com.persist.learn.design_patterns.behavior.zerenlian.demo1;

/**
 * Created by 张冲 on 2019/11/19.
 */
public class DeptManage extends Handler {

    @Override
    public String handlerFeeRequest(String user, double fee) {
        //结果集
        String result = "";

        //当前处理对象是否满足条件
        if(fee < 1000){

            //并且只能处理张三的请求
            if ("张三".equals(user)) {
                result = "成功,部门经理同意" + user + " 的请求,金额为 " + fee + "元.";
            } else {
                //其他人一律不同意
                result = "失败,部门经理不同意" + user + " 的请求,金额为 " + fee + "元.";
            }
        } else {
            //如果超过1000, 就继续传递给更高级别的人处理

            if(getSuccessor() != null){

                return getSuccessor().handlerFeeRequest(user,fee);
            }
        }

        return result;
    }
}
