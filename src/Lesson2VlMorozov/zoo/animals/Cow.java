package Lesson2VlMorozov.zoo.animals;


import Lesson2VlMorozov.zoo.Flyable;
import Lesson2VlMorozov.zoo.Herbivores;

public class Cow extends Herbivores implements Flyable {
    private int flightSpeed = 13;
    private int flightHing = 2;
    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Cow says Muu!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHeight() {
        return this.flightHing;
    }
}
