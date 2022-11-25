package SEM_3_PhoneBook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Helen", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("John", "344");
        phoneBook.add("John", "122");

        List<String> strings = phoneBook.get("John");
        System.out.println(strings);
    }
}
