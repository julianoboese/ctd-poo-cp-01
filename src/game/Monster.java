package game;

public class Monster extends Character {
    private final String type;
    private final Integer attackPoints;

    public Monster(Integer lifePoints, String type, Integer attackPoints) {
        super(lifePoints);
        this.type = type;
        this.attackPoints = attackPoints;
    }

    public void receiveDamage(Integer attackPoints) {
        if (attackPoints >= this.getLifePoints()) {
            System.out.println("A " + this.type + " has died.");
            this.setLifePoints(0);
        } else {
            this.setLifePoints(this.getLifePoints() - attackPoints);
        }
    }

    public void attack(Character enemy) {
        System.out.println("A " + this.type + " attacks!");
        enemy.receiveDamage(attackPoints);
    }
}
