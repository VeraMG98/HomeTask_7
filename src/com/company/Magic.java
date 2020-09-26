package com.company;

public class Magic extends HeroClass{

    public Magic(int health, int damage, String supperAbility) {
        super(health, damage, supperAbility);
    }

    @Override
    public void applySuperAbility(String supperAbilityType) {
        System.out.println("Маг использует суперсилу " + supperAbilityType);
    }
}
