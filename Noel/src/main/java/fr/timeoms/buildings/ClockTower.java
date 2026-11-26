package fr.timeoms.buildings;

public class ClockTower extends Building implements IMaintenable{
    private static int total = 0;

    public ClockTower() {
        super(12, 15, DegreeCleanliness.BAD);
    }

    public static void addTotal(int value) {
        ClockTower.total += value;
    }

    public static int getTotal() {
        return total;
    }
}
