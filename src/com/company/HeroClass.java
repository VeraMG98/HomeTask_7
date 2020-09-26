package com.company;

public abstract class HeroClass implements HavingSuperAbility {

    private int health;
    private int damage;
    private String supperAbility;

    public HeroClass(int health, int damage, String supperAbility) {
        this.health = health;
        this.damage = damage;
        this.supperAbility = supperAbility;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSupperAbility() {
        return supperAbility;
    }
}
