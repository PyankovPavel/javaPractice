package Lesson2VlMorozov.zoo.animals;


import Lesson2VlMorozov.zoo.Herbivores;
import Lesson2VlMorozov.zoo.Runable;

public class Goat extends Herbivores implements Runable {
    private int runSpeed = 4;

    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Goat says Beee!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
