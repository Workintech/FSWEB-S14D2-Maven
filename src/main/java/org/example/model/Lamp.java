package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {

    private LampType style;
    private boolean batteryType;
    private int globRating;

    public Lamp(LampType style, boolean batteryType, int globRating) {
        this.style = style;
        this.batteryType = batteryType;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return batteryType;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", batteryType=" + batteryType +
                ", globRating=" + globRating +
                '}';
    }
}
