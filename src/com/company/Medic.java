package com.company;

public class Medic extends HeroClass {

    public Medic(int health, int damage, String supperAbility) {
        super(health, damage, supperAbility);
    }

    @Override
    public void applySuperAbility(String supperAbilityType) {
        System.out.println("Medic использует суперсилу " + supperAbilityType);
    }
}
