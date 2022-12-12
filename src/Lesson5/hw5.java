package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу вычисления n-ого треугольного числа.
 */
public class hw5 {
    public static void main(String[] args) throws IOException {
        visualAnswer(solution(getNum()));
    }

    /**
     * Вычисляем треугольное число по формуле n * (n + 1) / 2
     * @param number принимаем на вход число, которое необходимо триангулировать
     * @return результат в виде int
     */
    public static int solution(int number) {
        return (int) (number / 2.0 * (++number));
    }

    /**
     * Небольшой метод на прием числа из консоли
     * @return Возвращает число в виде int
     * @throws IOException
     */
    public static int getNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;
        System.out.println("Input a number you want to be triangulate: ");
        try {
            number = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Wrong input. Please input a number: ");
            number = Integer.parseInt(br.readLine());
        }
        return number;
    }

    /**
     * Визуализируем ответ в виде треугольника
     * @param answer на вход принимается число-ответ, будем использовать его в качестве границы цикла для
     *               отрисовки треугольника
     */
    public static void visualAnswer(int answer) {
        System.out.printf("Answer is %d and it can be represent as triangle:\n", answer);
        String s = "◎";
        for (int i = 1; i <= answer; i++) {
            System.out.println(s.repeat(i));
        }
    }
}
