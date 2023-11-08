package org.example;

public class StringBar extends Bar {
    boolean happyHour = false;
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }
    @Override
    public void startHappyHour() {
        happyHour = true;
    }
    @Override
    public void endHappyHour() {
        happyHour = false;
    }
}
