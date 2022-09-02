package game;

public class Game {
    public static void main(String[] args) {
        Weapon shield = new Weapon("Captain America's Shield", 3);
        Weapon lasso = new Weapon("The Lasso of Truth", 4);
        Weapon hammer = new Weapon("Mjolnir", 5);

        Hero captainAmerica = new Hero(200, "Captain America", shield);
        Hero wonderWoman = new Hero(150, "Wonder Woman", lasso);
        Hero thor = new Hero(280, "Thor", hammer);

        Monster mutant1 = new Monster(80, "Mutant", 30);
        Monster mutant2 = new Monster(60, "Mutant", 35);
        Monster titan1 = new Monster(100, "Titan", 20);
        Monster titan2 = new Monster(120, "Titan", 25);
        Monster demon1 = new Monster(90, "Demon", 35);
        Monster demon2 = new Monster(150, "Demon", 20);

        Hero[] heroes = new Hero[]{captainAmerica, wonderWoman, thor};
        Monster[] monsters = new Monster[]{mutant1, mutant2, titan1, titan2, demon1, demon2};

        Battle battle = new Battle(heroes, monsters);

        battle.runBattle();
    }
}
