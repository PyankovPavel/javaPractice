package Lesson4VlMorozov.items;


import Lesson4VlMorozov.weapons.Bow;

public class Archer extends Warrior<Bow> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon) {
        super(name, weapon);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
