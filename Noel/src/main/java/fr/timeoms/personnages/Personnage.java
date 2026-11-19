package fr.timeoms.personnages;

public abstract class Personnage {
    private String nom, sexe;
    private int age, magie_noel, faim, fatigue;

    public abstract void emettreSon();
    public abstract void seDeplacer();
    public abstract void seRestaurer();
    public abstract void seReposer();

    public Personnage(String nom, String sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        magie_noel = 0;
        faim = 0;
        fatigue = 0;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", age=" + age +
                ", magie_noel=" + magie_noel +
                ", faim=" + faim +
                ", fatigue=" + fatigue +
                '}';
    }

    public void augmenterMagieNoel() {
        magie_noel += 1;
    }

    public void baisserMagieNoel() {
        magie_noel -= 1;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMagie_noel(int magie_noel) {
        this.magie_noel = magie_noel;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public int getMagie_noel() {
        return magie_noel;
    }

    public int getFaim() {
        return faim;
    }

    public int getFatigue() {
        return fatigue;
    }
}
