package Lesson2VlMorozov.zoo.animals;


import Lesson2VlMorozov.zoo.Predator;
import Lesson2VlMorozov.zoo.Runable;
import Lesson2VlMorozov.zoo.Swimmable;

public class Crocodile extends Predator implements Runable, Swimmable {
    private int swimSpeed = 20;
    private int runSpeed = 100;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Crocodile says Shhhhh";
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
