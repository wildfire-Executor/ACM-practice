package org.example;
import java.lang.String;
import java.util.Scanner;
public class A017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
        int n=sc.nextInt();

        sc.nextLine();
        String[] string=new String[n];

        for(int i=0;i<n;i++){
            string[i]=sc.nextLine();

            int count=0;

            for (int j = 0; j < string[i].length(); j++) {
                if (Character.isDigit(string[i].charAt(j))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
}
