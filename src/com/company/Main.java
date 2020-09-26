package com.company;

public class Main {

    public static void main(String[] args) {
        HeroClass[] heroes = new HeroClass[] {
                new Warrior(220, 25, "Phisical"),
                new Magic(200, 30,"Magic"),
                new Medic(205,0,"Medic")};
        for (HeroClass hero : heroes) {
            hero.applySuperAbility(hero.getSupperAbility());
        }
    }
}
