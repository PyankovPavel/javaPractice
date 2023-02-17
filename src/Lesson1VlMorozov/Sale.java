package Lesson1VlMorozov;

import java.util.Date;

/**
 * Класс для того, чтобы показать товары по скидке.
 */
public class Sale extends Product {
    private Date salesTime;

    public Sale(String name, double cost, Date salesTime) {
        super(name, cost);
        this.salesTime = salesTime;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" !Скидка на товар %s стоимостью %.2f длится до %s",
                super.getName(), super.getCost(),
                salesTime.toString());
    }
}
