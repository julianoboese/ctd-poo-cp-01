package game;

public class Weapon {
    private final String name;
    private final Integer power;

    public Weapon(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public Integer attackPoints() {
        return power * 10;
    }
}
