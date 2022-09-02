package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Battle {
    private final List<Character> heroes = new ArrayList<>();
    private final List<Character> monsters = new ArrayList<>();
    private Integer turn = 0;

    public Battle(Hero[] heroes, Monster[] monsters) {
        Collections.addAll(this.heroes, heroes);
        Collections.addAll(this.monsters, monsters);
        Collections.shuffle(this.heroes);
        Collections.shuffle(this.monsters);
    }

    public void runBattle() {
        this.beginBattle();
        while (!this.isBattleOver()) {
            this.runNextTurn();
        }
    }

    public void beginBattle() {
        System.out.println("|----- Begin Battle! -----|");
        this.runNextTurn();
    }


    public Boolean isBattleOver() {
        if (this.monsters.size() == 0) {
            System.out.println(System.lineSeparator() + "|----- Heroes win! -----|");
            return true;
        }

        if (this.heroes.size() == 0) {
            System.out.println(System.lineSeparator() + "|----- Monsters win! -----|");
            return true;
        }

        return false;
    }

    public void runNextTurn() {
        this.turn++;
        System.out.println(System.lineSeparator() + "|----- Turn " + this.turn + " -----|");
        this.performCharactersActions(heroes, monsters);
        this.performCharactersActions(monsters, heroes);
    }

    public void performCharactersActions(List<Character> characters, List<Character> enemies) {
        for (Character character : characters) {
            if (character.getClass() == Hero.class && character.getLifePoints() < 100) {
                ((Hero) character).heal((int) (50 * Math.random()));
            }

            character.attack(enemies.get(0));
            if (enemies.get(0).getLifePoints() == 0) {
                enemies.remove(0);
            }

            if (this.isBattleOver()) System.exit(0);
        }
    }
}
