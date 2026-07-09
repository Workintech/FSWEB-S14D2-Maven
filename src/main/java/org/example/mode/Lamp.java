package org.example.mode;

import org.example.model.enums.LampType;

public class Lamp {

    // 1. Adım: Instance variable'ların tanımlanması (Hepsi private)
    private LampType style;
    private boolean battery;
    private int globRating;

    // 2. Adım: 3 değişkeni de alan tek bir constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // 3. Adım: İstenen 4 metodun yazılması
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globRating;
    }
}