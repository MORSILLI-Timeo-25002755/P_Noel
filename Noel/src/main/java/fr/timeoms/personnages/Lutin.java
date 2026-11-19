package fr.timeoms.personnages;

public class Lutin extends Personnage implements IBeFantastic{

    public Lutin(String nom, String sexe, int age) {
        super(nom, sexe, age);
    }

    @Override
    public void emettreSon() {
        System.out.println("Lutin fait un bruit");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Lutin se déplace");
    }

    @Override
    public void seRestaurer() {
        System.out.println("Lutin se restaure");
    }

    @Override
    public void seReposer() {
        System.out.println("Lutin se repose");
    }

    @Override
    public void auraFarm() {
        System.out.println("Gnark gnark");
    }
}
