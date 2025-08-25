package org.example;
import java.util.Scanner;
public class A021 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){

            int n=sc.nextInt();

            if(n==0){
                break;
            }
            int total=0;

            int[] moneyType={100,50,10,5,2,1};

            for(int i=0;i<n;i++){
               int salary=sc.nextInt();
               int rest=salary;
               for(int j=0;j<moneyType.length;j++){
                   total+=rest/moneyType[j];
                   rest%=moneyType[j];
                   if(rest==0){
                       break;
                   }
               }
            }
            System.out.println(total);
        }
    }
}
