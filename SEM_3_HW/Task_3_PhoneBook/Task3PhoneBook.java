package SEM_3_HW.Task_3_PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class Task3PhoneBook {
    public static void PhoneBook() {
        
        Map<Integer, String> phoneMap = new HashMap<>();
        add(phoneMap, 3444, "Иванов");
        add(phoneMap, 3445, "Петрова");
        add(phoneMap, 3446, "Сидоров");
        add(phoneMap, 3447, "Сидоров");
        
        System.out.println(phoneMap);
        get(phoneMap, "Сидоров");
    }
    public static void add(Map<Integer,String> phoneMap, int phoneNumber, String surname) {
        phoneMap.put(phoneNumber, surname);
    }
    public static void get(Map<Integer, String> phoneMap, String surname) {
        for(Map.Entry<Integer, String> entry: phoneMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            if (value == surname){
                System.out.println(value + " " + " номер телефона " + key);
            }
        }
    } 
}
