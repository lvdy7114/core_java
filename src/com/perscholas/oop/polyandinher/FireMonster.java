package com.perscholas.oop.polyandinher;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
