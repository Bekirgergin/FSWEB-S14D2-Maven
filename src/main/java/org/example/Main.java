package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall northWall = new Wall("North");
        Wall southWall = new Wall("South");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 50, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 80);
        Wardrobe wardrobe = new Wardrobe(150, 200, 75.5);
        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                northWall, southWall, eastWall, westWall,
                ceiling, bed, lamp, wardrobe, carpet
        );

        // Erişim ve Metot Testleri
        System.out.println("Oda Adı: " + bedroom.getName());
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}