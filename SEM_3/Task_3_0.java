/**
 * Заполнить список строк.
 * Вывести строки + количество их повторений.
 * (это как бы расширение задания Task_2)
 */

package SEM_3;

/**
 * import java.util.HashSet; // Вместо этого,
 * import java.util.Set;     // этого
 * import java.util.Scanner; // и этого
 */

import java.util.*; // ставим звёздочку (*;)

public class Task_3_0 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Длина списка ввода: ");
        int len = iScanner.nextInt();
        scanWords(len);
        iScanner.close();
    }

    public static void scanWords(int len) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < len; i++) {
            System.out.println("Введите слово: ");
            String word = iScanner.next();

            if (words.containsKey(word)) {
                int count = words.get(word);
                words.put(word, count + 1);
            } else {
                words.put(word, 1);
            }
        }

        iScanner.close();
        System.out.println(words.toString());
    }
}

/**
 * в Терминале:
 * Длина списка ввода: 3
 * Введите слово:
 * qwe
 * Введите слово:
 * qwe
 * Введите слово:
 * qwe
 * Получим: {qwe =3}
 */