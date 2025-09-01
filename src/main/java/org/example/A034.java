package org.example;
import java.util.Scanner;
public class A034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder sbA = new StringBuilder();
            StringBuilder sbB = new StringBuilder();
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m==0){
                break;
            }
            for(int i = 0; i < n; i++){
                sbA.append(sc.nextInt());
            }for(int i = 0; i < m; i++){
                sbB.append(sc.nextInt());
            }
            for(int i = sbA.length() - 1; i >= 0; i--) {
                char currentChar = sbA.charAt(i);
                boolean foundInB = false;
                for(int j = 0; j < sbB.length(); j++) {
                    if(currentChar == sbB.charAt(j)) {
                        foundInB = true;
                        break;
                    }
                }

                if(foundInB) {
                    sbA.deleteCharAt(i);
                }
            }

            if(sbA.length() > 0) {
                for(int i = 0; i < sbA.length(); i++) {
                    if(i > 0) {
                        System.out.print(" ");
                    }
                    System.out.print(sbA.charAt(i));
                }
                System.out.println();
            } else {
                System.out.println("NULL");
            }
        }
    }
}
