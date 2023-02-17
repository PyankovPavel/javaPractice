package Lesson2VlMorozov.zoo.animals;


import Lesson2VlMorozov.zoo.Predator;
import Lesson2VlMorozov.zoo.Runable;

public class Leo extends Predator implements Runable {
    private int runSpeed = 300;

    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Leo says Rrrr!";
    }


    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}