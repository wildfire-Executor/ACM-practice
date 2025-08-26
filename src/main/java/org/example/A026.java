package org.example;

import java.util.Scanner;

public class A026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");
            String result = "";

            for(int i = 0; i < words.length; i++) {
                if (!words[i].isEmpty()) {

                    char firstChar = Character.toUpperCase(words[i].charAt(0));
                    String rest = words[i].substring(1);
                    result += firstChar + rest;

                    if (i < words.length - 1) {
                        result += " ";
                    }
                }
            }
            System.out.println(result);
        }
    }
}
