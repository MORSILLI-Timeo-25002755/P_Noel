package fr.timeoms.buildings;

import fr.timeoms.characters.ICharacter;

import java.util.HashSet;

public interface IMaintenable {

    DegreeCleanliness getIndicator();
    HashSet<ICharacter> getCharacters();
    void setIndicator(DegreeCleanliness indicator);

    default void maintain() {
        if(getIndicator().equals(DegreeCleanliness.BAD))  {
            if(getCharacters().isEmpty()) {
                setIndicator(getIndicator().next());
                System.out.println("Entretient effectué !");
            } else
                System.out.println("Il y a encore des personnes !");
        } else
            System.out.println("La salle est relativement propre !");
    }
}
