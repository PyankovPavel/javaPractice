package Lesson4VlMorozov.items;


import Lesson4VlMorozov.weapons.Sword;

public class SwordMan extends Warrior<Sword> {
    public SwordMan(String name, Sword weapon) {
        super(name, weapon);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}