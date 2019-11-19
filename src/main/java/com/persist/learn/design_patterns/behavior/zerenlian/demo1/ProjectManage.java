package com.persist.learn.design_patterns.behavior.zerenlian.demo1;

/**
 * Created by 张冲 on 2019/11/19.
 */
public class ProjectManage extends Handler {

    @Override
    public String handlerFeeRequest(String user, double fee) {
        String result = "";

        //项目经理权限小，只有500以内可以批
        if (fee < 500) {

            //并且只能处理张三的请求
            if ("张三".equals(user)) {
                result = "成功,项目经理同意" + user + " 的请求,金额为 " + fee + "元.";
            } else {
                //其他人一律不同意
                result = "失败,项目经理不同意" + user + " 的请求,金额为 " + fee + "元.";
            }

        } else {

            //超过500 , 传递给更大权限的人去处理
            if (getSuccessor() != null) {
                return getSuccessor().handlerFeeRequest(user, fee);
            }
        }

        return result;
    }
}
