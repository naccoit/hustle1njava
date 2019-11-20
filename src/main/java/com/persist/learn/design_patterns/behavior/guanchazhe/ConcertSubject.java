package com.persist.learn.design_patterns.behavior.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 张冲
 * @date 2019/11/20
 */
public class ConcertSubject implements Subject {

    List<Observer> obList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        obList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver(String state) {
        for(Observer o : obList){
            o.update(state);
        }
    }
}
