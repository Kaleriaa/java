package prac_13_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CompareDate {
    int year, month, day, hour, minute, second;
    Calendar calUser = Calendar.getInstance();
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

    public CompareDate(int yearU, int monthU, int dayU){
        calUser.set(Calendar.YEAR, yearU);
        calUser.set(Calendar.MONTH, monthU);
        calUser.set(Calendar.DAY_OF_MONTH, dayU);
        calUser.get(Calendar.HOUR_OF_DAY);
        calUser.get(Calendar.MINUTE);
        calUser.get(Calendar.SECOND);
    }

    public CompareDate() {
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
        hour = cal.get(Calendar.HOUR_OF_DAY);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }

    public void to1() {
        System.out.printf("Now is " + sdf.format(calUser.getTime()));
    }

    public void to() {
        System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",
                year, month+1, day, hour, minute, second);
    }

    public void compareCal(){
        System.out.println("Compare:");
        System.out.println(sdf.format(cal.getTime()).equals(sdf.format(calUser.getTime())));
    }
}
