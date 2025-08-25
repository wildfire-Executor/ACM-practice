package org.example;
import java.util.Scanner;
public class A024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                boolean isValid = true;
                char firstChar = str.charAt(0);

                if (!Character.isLetter(firstChar)) {
                    isValid = false;
                } else {
                    for (int j = 1; j < str.length(); j++) {
                        char c = str.charAt(j);
                        if (!Character.isLetterOrDigit(c) && c != '_') {
                            isValid = false;
                            break;
                        }
                    }
                }
                System.out.println(isValid?"yes":"no");
            }
        }
    }
}
