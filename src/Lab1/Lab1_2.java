package Lab1;

//Lab1_2 (Day of year converter)

import java.time.Month;

public class Lab1_2 {
    public static void main(String[] args) {
        int year = (int)(Math.random() * 2020);
        int dayNum = (int)(Math.random() * 365);
        int [] daysInMonths = new int[12];
        String [] months = new String[12];
        for (int i = 0; i < 12;) {
            if (i!=1) {daysInMonths[i] = Month.of(++i).maxLength();}
            else daysInMonths[i++]=28;
            months[--i] = Month.of(++i).name();
        }
        int monthNum = 0;
        Boolean isLeapYear = false;
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {isLeapYear = true;}

        System.out.println("dayNum: " + dayNum + " year: " + year + " isLeapYear: " + isLeapYear);

        for (int days: daysInMonths) {
            if (isLeapYear) {daysInMonths[1] = 29;}
            if (dayNum <= days) {break;}
            dayNum -= days;
            monthNum++;
        }
        System.out.print(months[monthNum] + " " + dayNum);
        System.out.println();
    }
}
