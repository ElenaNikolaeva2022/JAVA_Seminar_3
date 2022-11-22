/**
 * С консоли вводятся 10 слов.
 * Нужно их прочитать и вывести только уникальные.
 */

package SEM_3;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Длина списка ввода: ");
        int len = iScanner.nextInt();
        scanWords(len);
        iScanner.close();
    }

    public static void scanWords(int len) {
        Scanner iScanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        for (int i = 0; i < len; i++) {
            System.out.println("Введите слово: ");
            words.add(iScanner.next());
        }
        iScanner.close();
        System.out.println(words.toString());
    }
}

/**
 * в Терминале:
 * Длина списка ввода: 5 (вводим, например 5)
 * Введите слово: 12345 (вводим сами)
 * Введите слово: abcd (вводим сами)
 * Введите слово: 12345678 (вводим сами)
 * Введите слово: abc (вводим сами)
 * Введите слово: qwe (вводим сами)
 * Получим: [abc, 12345, 12345678, qwe, abcd]
 */