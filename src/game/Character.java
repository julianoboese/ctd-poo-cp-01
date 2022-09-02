package game;

public abstract class Character {
    private Integer lifePoints;

    public Character(Integer lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(Integer lifePoints) {
        this.lifePoints = lifePoints;
    }

    public abstract void receiveDamage(Integer attackPoints);

    public abstract void attack(Character enemy);
}
