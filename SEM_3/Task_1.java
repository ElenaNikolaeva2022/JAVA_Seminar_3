/**
 * Запопнить список десятью случайными числани.
 * Отсортировать список методом sort() и вывести его на экран.
*/

package SEM_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_1 {
   public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(); 
    numbers.add(5);
    numbers.add(3);
    numbers.add(10);
    numbers.add(2);
    numbers.add(5);
    System.out.println(numbers);
    
    Collections.sort(numbers); // Метод сортировки есть в библиотеке.
    System.out.println(numbers); // Выводим на экран
   }
}

// /** 
//  * в Терминале будет:
//  * [5, 3, 10, 2, 5]
//  * [2, 3, 5, 5, 10]
//  */ 

