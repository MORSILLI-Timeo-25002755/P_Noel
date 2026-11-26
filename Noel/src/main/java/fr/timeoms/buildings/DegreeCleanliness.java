package fr.timeoms.buildings;

public enum DegreeCleanliness {
    BAD(2),
    OK(1),
    GOOD(0);

    private int id;

    DegreeCleanliness(int id) {
        this.id = id;
    }

    public DegreeCleanliness next() {
        return toDegree(Math.abs(id + 1) % 3);
    }

    private static DegreeCleanliness toDegree(int id) {
        return switch (id) {
            case 1 -> OK;
            case 2 -> BAD;
            default -> GOOD;
        };
    }
}
