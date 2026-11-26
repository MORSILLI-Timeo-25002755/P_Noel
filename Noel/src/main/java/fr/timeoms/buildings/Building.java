package fr.timeoms.buildings;

import java.util.HashSet;
import fr.timeoms.characters.ICharacter;

public abstract class Building {
    private int area, capacity;
    private HashSet<ICharacter> characters;
    private DegreeCleanliness indicator;

    public Building(int area, int capacity, DegreeCleanliness indicator) {
        this.area = area;
        this.capacity = capacity;
        this.characters = new HashSet<>();
        this.indicator = indicator;
    }

    public void addCharacter(ICharacter character) {
        characters.add(character);
    }

    public void removeCharacter(ICharacter character) {
        characters.remove(character);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public HashSet<ICharacter> getCharacters() {
        return characters;
    }

    public void setCharacters(HashSet<ICharacter> characters) {
        this.characters = characters;
    }

    public DegreeCleanliness getIndicator() {
        return indicator;
    }

    public void setIndicator(DegreeCleanliness indicator) {
        this.indicator = indicator;
    }

    public int numberOfCharacters() {
        return characters.size();
    }

    public void show_characters_infos() {
        for(ICharacter c : characters)
            System.out.println(c);
    }

    @Override
    public String toString() {
        return "Building{" +
                "indicator=" + indicator +
                ", capacity=" + capacity +
                ", area=" + area +
                '}';
    }
}
