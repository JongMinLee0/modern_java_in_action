package quiz4;

import java.lang.reflect.Type;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "name : " + this.name + ", isVegetrian : " + this.vegetarian + ", calories : " + this.calories
                +", type : " + this.type;
    }

    public enum Type {MEAT, FISH, OTHER}
}
