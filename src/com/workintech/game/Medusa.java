package com.workintech.game;

public class Medusa extends Monster implements Poisonous{
    public Medusa(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double poison() {
        return getDamage() * 0.30;
    }

    @Override
    public double attack() {
        return getDamage() + poison();
    }
}
