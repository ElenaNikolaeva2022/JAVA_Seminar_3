/**
 * С помощью этих знаний решить Задание в файле "Task_3_0".
 * 
 * Задание:
 * Заполнить список названиями планет Солночной системы 
 * в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке.
 */

package SEM_3;

import java.util.*;

public class Task_3_1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // TreeMap
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");

        /**
         * если написать новое значение "Overwrite", например, в 1-ом ключе,
         * то оно будет перезаписано и в Терминале получится:
         * {1=Overwrite, 2=Second, 3=Third}
         */

        // map.put(1, "Overwrite");

        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(5));

        System.out.println(map.get(3));

        map.remove(2); // Чтобы удалить, например, ключ 2
        System.out.println(map); // в Терминале будет: {1=First, 3=Third}

    }
}

/**
 * в Терминале будет:
 * {1="First", 2=Second, 3=Third}
 * true
 * false
 * Third
 * {1=First, 3=Third}
 */
