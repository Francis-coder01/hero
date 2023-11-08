package org.example;

public abstract interface BarObserver {
    abstract void happyHourStarted(Bar bar);
    abstract void happyHourEnded(Bar bar);
}
