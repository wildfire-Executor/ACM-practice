package org.example;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class A005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        while(sc.hasNext()){
            String date=sc.nextLine();
            Date dt=sdf.parse(date);
            Calendar cal=Calendar.getInstance();
            cal.setTime(dt);
            int days=cal.get(Calendar.DAY_OF_YEAR);
            System.out.println(days);
        }
    }
}
