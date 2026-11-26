package fr.timeoms.characters;

import fr.timeoms.buildings.Building;

public class Lohann extends ICharacter {
    @Override
    public void sound() {
        System.out.println("sqfpdiuhqidfbgiqdbfgu");
    }

    public Lohann(Building current) {
        super("Lohan", "Male alpha", 120, 50, current);
    }
}
