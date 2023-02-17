package Lesson2VlMorozov.zoo.animals;


import Lesson2VlMorozov.zoo.Flyable;
import Lesson2VlMorozov.zoo.Herbivores;
import Lesson2VlMorozov.zoo.Runable;
import Lesson2VlMorozov.zoo.Swimmable;

public class Duck extends Herbivores implements Flyable, Runable, Swimmable {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 10;
    private int swimSpeed = 15;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Duck says Krya Krya!";
    }


    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHeight() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSwimmingSpeed() {
        return this.swimSpeed;
    }
}
