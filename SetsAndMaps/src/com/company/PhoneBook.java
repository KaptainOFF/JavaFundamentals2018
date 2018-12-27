package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        boolean isSearch = false;
        boolean isStop = false;

        while(!isSearch) {
            String[] contacts = scanner.nextLine().split("-");
            if("search".equals(contacts[0])) {
                isSearch = true;
                continue;
            }
            phoneBook.put(contacts[0],contacts[1]);
        }

        while(!isStop) {
            String contact = scanner.nextLine();
            if("stop".equals(contact)) {
                isStop = true;
                continue;
            }

            if(phoneBook.containsKey(contact)) {
                System.out.printf("%s -> %s%n",contact, phoneBook.get(contact));
            } else {
                System.out.printf("Contact %s does not exist.%n", contact);
            }
        }

    }
}
