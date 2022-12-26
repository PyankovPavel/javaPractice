package Lesson9Oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        Worker wk = new Worker(22, 15000, "Alex");
        Button bt = new Button();
        bt.click(wk);
    }
}

/**
 * Создаем класс Worker, который будем "экспортировать" в разные форматы.
 */
class Worker {
    int age;
    int salary;
    String name;

    public Worker() {
    }

    public Worker(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
}

/**
 * Интерфейс для распечатывания сведений о Worker в необходимом формате
 */
interface SaveAs {
    void print(Worker someWorker);
}

class XmlFormat implements SaveAs {
    @Override
    public void print(Worker someWorker) {
        System.out.print("<xml>\n<Worker>\n");
        System.out.printf("<age>%d</age>\n<salary>%d</salary>\n<name>%s</name>\n",
                someWorker.age, someWorker.salary, someWorker.name);
        System.out.print("</Worker>\n</xml>");
    }

}

class MdFormat implements SaveAs {
    @Override
    public void print(Worker someWorker) {
        System.out.println("# Worker");
        System.out.printf("* age %d\n* salary %d\n* name %s\n ",
                someWorker.age, someWorker.salary, someWorker.name);

    }

}

class JsonFormat implements SaveAs {
    @Override
    public void print(Worker someWorker) {
        System.out.print("{\n 'worker' : {\n ");
        System.out.printf("'age':%d\n 'salary':%d\n 'name':%s\n",
                someWorker.age, someWorker.salary, someWorker.name);
        System.out.print("}\n}");
    }

}

/**
 * Класс, содержащий в себе некую кнопку с функцией click(), которая будет предлагать сохранять сведения о нашем Worker
 * в нужном нам формате.
 */
class Button {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Метод, экспортирующий сведения о Worker в необходимом формате.
     * @param someWorker на вход принимает объект класса Worker
     */
    public void click(Worker someWorker) {
        int select;
        while (true) {
            try {
                System.out.println("Input 1 to export in xml, 2 - to md, 3 - to json: ");
                select = Integer.parseInt(br.readLine());
                if (select == 0 | select > 3) {
                    System.out.println("Error. Please input number from 1 to 3.");
                } else {
                    break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error. Please input number from 1 to 3.");
            }
        }
        switch (select) {
            case 1:
                XmlFormat xml = new XmlFormat();
                xml.print(someWorker);
                break;
            case 2:
                MdFormat md = new MdFormat();
                md.print(someWorker);
                break;
            case 3:
                JsonFormat js = new JsonFormat();
                js.print(someWorker);
                break;
        }
    }
}

