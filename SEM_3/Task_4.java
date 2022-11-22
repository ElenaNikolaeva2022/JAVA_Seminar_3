/**
 * Тернарный (тройной) оператор Java является единственным условным оператором, 
 * который принимает три операнда. Используется как замена одного оператора 
 * if-then-else и часто применяется в Java-программировании. 
 * В одной строке кода троичный оператор позволяет вам присвоить 
 * значение переменной на основе логического выражения — либо логического поля, 
 * либо оператора, который оценивает логический результат.
 */

package SEM_3;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();

            Integer count = map.get(word);
            count = (count != null) ? count + 1 : 1; // Пишем так вместо (смотри строки 27-31)
            // Тернарный (тройной) оператор.
            // Object value = expression ? trueValue : falseValue; // Пояснение к строке 23.

            // if (count != null) {
            // count = count + 1;
            // } else {
            // count = 1;
            // }

            map.put(word, count);
        }

        System.out.println(map);
    }
}

/**
 * в Терминале:
 * 5 (вводим сами)
 * a b a c b (вводим сами)
 * {a=2, b=2, c=1} (получим ответ)
 */
