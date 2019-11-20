package com.persist.learn.design_patterns.behavior.guanchazhe;

/**
 *
 * @author 张冲
 * @date 2019/11/20
 */
public class ConcertObserver implements Observer {

    private String name;

    public ConcertObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println("已经修改当前对象 " + name + "的状态为 :");
        System.out.println("==================" + state + "===================");
    }
}
