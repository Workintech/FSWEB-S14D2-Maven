package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(new Room("Yatak Odası",new Wall("kuzey"),new Wall("guney"),new Wall("batı"),new Wall("dogu"),new Ceiling(4,PaintColor.GREEN)),new Bed("Modern",2,1,2,1),new Lamp(LampType.LAVA,false,10),new Wardrobe(2,3,70),new Carpet(3,4,PaintColor.GREEN));
        System.out.println(bedroom.toString());
    }
}