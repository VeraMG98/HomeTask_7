package com.company;

public class Warrior extends HeroClass {

    public Warrior(int health, int damage, String supperAbility) {
        super(health, damage, supperAbility);
    }

    @Override
    public void applySuperAbility(String supperAbilityType) {
        System.out.println("Warrior применяет суперсилу " + supperAbilityType);
    }
}
