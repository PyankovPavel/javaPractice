package Lesson2VlMorozov.zoo;

import Lesson2VlMorozov.zoo.radio.Sayable;

public abstract class Animal implements Sayable {

    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder srt = new StringBuilder();
        if (this instanceof Runable) {
            srt.append(" Скорость бега - > ").append(((Runable) this).getSpeedRun());
        }
        if (this instanceof Flyable) {
            srt.append(" Скорость полёта - > ").append(((Flyable) this).getSpeedFlyable());
        }
        if (this instanceof Swimmable) {
            srt.append(" Скорость плавания - > ").append(((Swimmable) this).getSwimmingSpeed());
        }
        return String.format(srt + " %s ест %s", this.name, this.feed());
    }
}
