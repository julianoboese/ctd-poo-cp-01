package game;

public class Hero extends Character {
    private final String name;
    private final Weapon weapon;

    public Hero(Integer lifePoints, String name, Weapon weapon) {
        super(lifePoints);
        this.name = name;
        this.weapon = weapon;
    }

    public void receiveDamage(Integer attackPoints) {
        if (attackPoints >= this.getLifePoints()) {
            System.out.println(this.name + " has died.");
            this.setLifePoints(0);
        } else {
            this.setLifePoints(this.getLifePoints() - attackPoints);
        }
    }

    public void attack(Character enemy) {
        System.out.println(this.name + " attacks with " + this.weapon.getName() + "!");
        enemy.receiveDamage(this.weapon.attackPoints());
    }

    public void heal(Integer healPoints) {
        System.out.println(this.name + " heals " + healPoints + " life points.");
        this.setLifePoints(this.getLifePoints() + healPoints);
    }
}
