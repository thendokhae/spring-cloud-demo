package com.thendokhae.microservices.limitservice.bean;

public class LimitConfiguration {
    int mininum;
    int maximum;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int mininum, int maximum) {
        this.mininum = mininum;
        this.maximum = maximum;
    }

    public int getMininum() {
        return mininum;
    }

    public void setMininum(int mininum) {
        this.mininum = mininum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
