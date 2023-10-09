package com.softserve.edu06.task1;

public class Penguin extends NonFlyingBird {

    Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getFeathers() + " has " + getLayEggs() + " eggs");
    }
}
