package com.isitech2;

public class Carre extends Rectangle {
    private int cote;

    public Carre(int side) {
        super(side, side);
        this.cote = side;
    }

    public void display() {
        for (int i = 0; i < cote; i++) {
            for (int j = 0; j < cote; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void surface() {
        System.out.print("Surface du carré : " + cote * cote + "m²");
    }
}
