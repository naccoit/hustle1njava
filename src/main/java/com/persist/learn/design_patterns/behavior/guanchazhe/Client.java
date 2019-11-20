package com.persist.learn.design_patterns.behavior.guanchazhe;

/**
 *
 * @author 张冲
 * @date 2019/11/20
 */
public class Client {

    public static void main(String[] args) {
        //1.创建观察者对象(订阅者)
        Observer o1 = new ConcertObserver("observer1");
        Observer o2 = new ConcertObserver("observer2");
        Observer o3 = new ConcertObserver("observer3");

        //2.创建被观察者(发布者)
        Subject s = new ConcertSubject();
        //3.将观察者与被观察对象关联起来
        s.addObserver(o1);
        s.addObserver(o2);
        s.addObserver(o3);

        s.notifyObserver("打开");

        System.out.println("=====FINISHED=====");
    }
}
