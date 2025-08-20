package org.example;
import java.util.Scanner;
public class A000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] string=new String[3];
        for(int i=0;i<=2;i++){
            string[i]=sc.nextLine();

        }
        for(int i=0;i<=2;i++){
            String s=string[i];
            char a=s.charAt(0);
            char b=s.charAt(1);
            char c=s.charAt(2);
            if(a>b){
                char temp=a;
                a=b;
                b=temp;
            }
            if(b>c){
                char temp=b;
                b=c;
                c=temp;
            }
            if(a>c){
                char temp=a;
                a=c;
                c=temp;
            }
            System.out.println(a+" "+b+" "+c);
        }


    }
}