package Lesson2VlMorozov;


import Lesson2VlMorozov.zoo.*;
import Lesson2VlMorozov.zoo.animals.*;
import Lesson2VlMorozov.zoo.radio.Radio;
import Lesson2VlMorozov.zoo.radio.Sayable;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба - Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд Дак"),
                new SeaCalf("Онотоле")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.say());
        }
        System.out.println("\n________Running animals______________");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Скорость бега " + animal.getSpeedRun() + "\n");
        }
        System.out.println("________Flying animals______________");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Скорость полета " + animal.getSpeedFlyable());
            System.out.println("Высота полета " + animal.getHeight() + "\n");
        }
        System.out.println("________Swimming animals______________");
        for (Swimmable animal : zoo.getSwimmableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Скорость плаванья " + animal.getSwimmingSpeed() + "\n");
        }
        System.out.println("____Определяем чемпиона по бегу_____");
        System.out.println(zoo.getRunChampion());
        System.out.println("____Определяем чемпиона по полётам_______");
        System.out.println(zoo.getFlightChampion());
        System.out.println("____Определяем чемпиона по плаванью_______");
        System.out.println(zoo.getSwimChampion());

    }
}
