package org.example;
import java.util.Scanner;
public class A030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();
            int count = 0;

            for(int i = 0; i < n; i++){
                String str = sc.nextLine();

                for(int j = 0; j < str.length(); j++){
                    char c = str.charAt(j);
                    if(c >= '\u4E00' && c <= '\u9FA5'){
                        count ++;
                    }
                }
                System.out.println(count);
                count = 0;
            }
    }
}
