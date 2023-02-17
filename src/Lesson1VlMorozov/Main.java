package Lesson1VlMorozov;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85,
                new GregorianCalendar(2023, Calendar.FEBRUARY, 25).getTime()));
        machine.addProduct(new Perishable("Молоко Коровка", 85,
                new GregorianCalendar(2023, Calendar.FEBRUARY, 25).getTime()));
        machine.addProduct(new Perishable("Молоко Василёк", 85,
                new GregorianCalendar(2023, Calendar.FEBRUARY, 25).getTime()));
        machine.addProduct(new Sale("M&M's", 19.99,
                new GregorianCalendar(2023, Calendar.MARCH, 1).getTime()));
        machine.addProduct(new Sale("Orbit", 10,
                new GregorianCalendar(2023, Calendar.FEBRUARY, 23).getTime()));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println(machine.findProduct("Orbit"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("M&M's").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);


    }
}
