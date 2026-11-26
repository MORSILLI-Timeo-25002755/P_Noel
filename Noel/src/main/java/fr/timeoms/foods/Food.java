package fr.timeoms.foods;

public enum Food {
    BISCUIT(1),
    HOT_CHOCOLATE(2),
    MARSHMALLOW(5),
    OATMEAL(5),
    BARLEY_SUGAR(10),
    CANDY(10);

    private final int value;

    Food(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().toLowerCase().replace("_", " ").substring(1);
    }
}
