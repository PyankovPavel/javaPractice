package Lesson2VlMorozov.zoo;


import Lesson2VlMorozov.zoo.radio.Sayable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Animal> animals, Sayable sayableObj) {
        this.radio = sayableObj;
        animalList.addAll(animals);

    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals) {
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            sayableList.add(animal);
        }
        sayableList.add(this.radio);
        return sayableList;
    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<Swimmable> getSwimmableList() {
        List<Swimmable> swimmableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Swimmable) {
                swimmableList.add((Swimmable) animal);
            }
        }
        return swimmableList;
    }

    public Animal getRunChampion() {
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners) {
            if (champion.getSpeedRun() < r.getSpeedRun()) {
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion() {
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers) {
            if (champion.getSpeedFlyable() < r.getSpeedFlyable()) {
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getSwimChampion() {
        List<Swimmable> swimmers = getSwimmableList();
        Swimmable champion = swimmers.get(0);
        for (Swimmable r : swimmers) {
            if (champion.getSwimmingSpeed() < r.getSwimmingSpeed()) {
                champion = r;
            }
        }
        return (Animal) champion;
    }

}



