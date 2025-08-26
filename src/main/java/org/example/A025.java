package org.example;
import java.util.Scanner;
import  java.util.ArrayList;
public class A025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            ArrayList<Character> list = new ArrayList<>();
            for(int i = 0; i < input.length(); i++){
                list.add(input.charAt(i));
            }
            int maxChar = input.charAt(0);
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) > maxChar){
                    maxChar = input.charAt(i);
                }
            }
            for(int i = input.length() - 1; i >= 0; i--){
                String str="(max)";
                if(input.charAt(i) == maxChar){
                    for (int j = 0; j < str.length(); j++) {
                        list.add(i + 1 + j, str.charAt(j));
                    }
                }
            }
            String result="";
            for (int i = 0; i < list.size(); i++) {
                char c = list.get(i);
                result = result + c;
            }
            System.out.println(result);
        }
    }
}


