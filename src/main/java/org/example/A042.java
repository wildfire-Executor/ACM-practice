package org.example;
import java.util.Scanner;
public class A042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++){
                boolean isLengthEnough = false;
                String password = sc.nextLine();
                if(password.length()>= 8 && password.length() <= 16){
                    isLengthEnough = true;
                }
                boolean hasUpper = false;
                boolean hasLower = false;
                boolean hasDigit = false;
                boolean hasSpecial = false;

                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        hasUpper = true;
                    } else if (Character.isLowerCase(c)) {
                        hasLower = true;
                    } else if (Character.isDigit(c)) {
                        hasDigit = true;
                    } else if (c == '~' || c == '!' || c == '@' || c == '#' ||
                            c == '$' || c == '%' || c == '^') {
                        hasSpecial = true;
                    }
                }

                boolean isOther = false;
                int count = 0;
                if(hasUpper){
                    count ++;
                }
                if(hasLower){
                    count ++;
                }
                if(hasDigit){
                    count ++;
                }
                if(hasSpecial){
                    count ++;
                }
                if(count >= 3){
                    isOther = true;
                }
                if(isLengthEnough && isOther){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }


        }
    }
}
