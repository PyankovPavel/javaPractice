package Lesson2VlMorozov.zoo.animals;

import Lesson2VlMorozov.zoo.Predator;
import Lesson2VlMorozov.zoo.Swimmable;

public class SeaCalf extends Predator implements Swimmable {
    private int swimSpeed = 30;

    public SeaCalf(String name) {
        super(name);
    }

    @Override
    public int getSwimmingSpeed() {
        return this.swimSpeed;
    }

    @Override
    public String say() {
        return "Sea calf says Mrrrr!";
    }
}
