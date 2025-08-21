package org.example;
import java.util.Scanner;
public class A006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int count = sc.nextInt();
            int[] numbers=new int[count];
            int init=1;
            for(int i=0;i<count;i++){
                numbers[i]=sc.nextInt();
                if(numbers[i]%2!=0){
                    init*=numbers[i];
                }
            }
            System.out.println(init);
        }
    }
}
