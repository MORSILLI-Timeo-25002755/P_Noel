package fr.timeoms;

import fr.timeoms.buildings.FelizNavidad;
import fr.timeoms.characters.Lohann;

public class Main {
    static void main() {
        FelizNavidad felizNavidad = new FelizNavidad();
        Lohann lohann = new Lohann(felizNavidad);
        System.out.println(lohann.getChristmas_magic());
        lohann.addChristmasMagic(50);
        System.out.println(lohann.getChristmas_magic());
        lohann.addChristmasMagic(-1000);
        System.out.println(lohann.getChristmas_magic());
        lohann.addChristmasMagic(1000000);
        System.out.println(lohann.getChristmas_magic());
        lohann.addChristmasMagic(-100);
        System.out.println(lohann.getChristmas_magic());
    }
}
