package Lesson3.Hw3;


/**
 * На вход  некоторому исполнителю подаётся четыре числа (a, b, c, d).
 * У исполнителя есть две команды  - команда 1 (к1): увеличить в с раз, а умножается на c;
 * - команда 2 (к2): увеличить на d , к a прибавляется d
 * Написать программу, которая выдаёт общее количество возможных преобразований a в b,
 * набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
 * <p>
 * Тестовые данные:
 * a: 2 b: 7 c: 2 d: 1 -> 3
 * a: 3 b: 27 c: 3 d: 2 -> 6
 * a: 30 b: 345 c: 5 d: 6 -> 0
 * a: 30 b: 345 c: 2 d: 1 -> 7047
 * a: 22 b: 333 c: 3 d: 1 -> 467
 * a: 55 b: 555 c: 5 d: 2 -> 30
 * a: 22 b: 2022 c: 11 d: 56 -> 0
 * a: 22 b: 2022 c: 11 d: 10 -> 18
 * a: 22 b: 2022 c: 3 d: 1 -> 763827
 * a: 22 b: 20220 c: 3 d: 1 -> 535173226980
 * a: 1 b: 1111 c: 2 d: 1 -> 3990330794
 * a: 1 b: 11111 c: 2 d: 1 -> 606408167570737286
 */
public class Homework3 {
    public static void main(String[] args) {
        int a = 22;
        int b = 2022;
        int c = 3;
        int d = 1;
        System.out.println(recursiveFind(a, b, c, d));
        String showMinStepsWay = minWaySteps(a, b, c, d);
        System.out.printf(showMinStepsWay);
    }

    static int recursiveFind(int a, int b, int c, int d) {
        if (a == b) return 1;
        if (a > b) return 0;
        else return recursiveFind(a + d, b, c, d) + recursiveFind(a * c, b, c, d);
    }

    static String minWaySteps(int a, int b, int c, int d) {
        StringBuilder answer = new StringBuilder("-> " + b);
        int count = 0;
        while (a != b) {
            if (b % c == 0 && b / c >= a) {
                answer.insert(0, " -> (a * c)");
                b = b / c;
                count++;
            } else if (b - d >= a) {
                answer.insert(0, " -> (a + d)");
                b = b - d;
                count++;
            } else {
                answer = new StringBuilder("Impossible!");
                return answer.toString();
            }
        }
        answer.insert(0, "Min amount of steps: " + count + ". The way is:");
        return answer.toString();
    }
}
