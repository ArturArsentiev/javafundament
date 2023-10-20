package com.softserve.edu06.hw.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + getFeathers() + '\'' +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
