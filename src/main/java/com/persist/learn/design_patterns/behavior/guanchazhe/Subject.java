package com.persist.learn.design_patterns.behavior.guanchazhe;

/**
 * Created by 张冲 on 2019/11/20.
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver(String state);
}
