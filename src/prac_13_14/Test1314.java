package prac_13_14;

import java.util.Calendar;

public class Test1314 {
    public static void main(String[] args) throws InterruptedException {
        CompareDate compareDate = new CompareDate();
        compareDate.to();
        CompareDate compareDate1 = new CompareDate(2021, 10, 11);
        compareDate1.to1();
        System.out.println();
        compareDate1.compareCal();
        System.out.println();

        TimeCode timeCode = new TimeCode();
        timeCode.timeAdd("!");
        System.out.println();
        timeCode.timeFind("!");
        System.out.println();
        timeCode.timeInsert(2, "twelve");
        System.out.println();
        timeCode.timeDelete("!");
    }
}
