package fr.timeoms.characters;

import fr.timeoms.buildings.Building;
import fr.timeoms.buildings.ClockTower;
import fr.timeoms.foods.Food;

public abstract class ICharacter {
    private String name, sex;
    private int age, hungriness, tiredness, christmas_magic;
    private State state;
    private Building current;

    public ICharacter(String name, String sex, int age, int christmas_magic, Building current) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hungriness = 0; // 100 il a faim
        this.tiredness = 0;
        this.christmas_magic = christmas_magic;
        this.state = State.ACTIVITY;
        this.current = current;
        current.addCharacter(this);
        ClockTower.addTotal(christmas_magic);
    }

    public int getChristmas_magic() {
        return christmas_magic;
    }

    public abstract void sound();

    public void move(Building building) {
        current.removeCharacter(this);
        building.addCharacter(this);
    }

    public void setState(State state) {
        if(this.state.equals(state) && state.equals(State.REST))
            System.out.println("Heuuuuu, tu dormais déjà");
        else if(this.state.equals(state) && state.equals(State.ACTIVITY))
            System.out.println("Heuuuuu, tu activityais déjà");
        else {
            if(state.equals(State.ACTIVITY))
                System.out.println("Le personnage est en actiivté");
            else
                System.out.println("Le personnage est entrain de dormir");

            this.state = state;
        }
    }

    public void eat(Food food) {
        if(state.equals(State.ACTIVITY))
            hungriness = Math.max(0, hungriness - food.getValue());
        else
            System.out.println("Heuuuu, nan tu dors enfaiteee");
    }

    public void addChristmasMagic(int value) {

        if(christmas_magic > 0 && christmas_magic + value < 0) {
            ClockTower.addTotal(-christmas_magic);
            christmas_magic = 0;
            return;
        }

        if(christmas_magic + value < 0)
            return;

        if(christmas_magic < 1000 && christmas_magic + value > 1000) {
            ClockTower.addTotal(1000-christmas_magic);
            christmas_magic = 1000;
            return;
        }

        if(christmas_magic + value > 1000)
            return;

        christmas_magic += value;
        ClockTower.addTotal(value);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", hungriness=" + hungriness +
                ", tiredness=" + tiredness +
                ", christmas_magic=" + christmas_magic +
                ", state=" + state +
                '}';
    }
}
