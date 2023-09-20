package predefinedclasses;

import java.util.Calendar;

public class CalendarClassExample {

    public static void main(String[] args) {
        Calendar currentCalender = Calendar.getInstance();
        System.out.println(currentCalender);

        Calendar specificDate = Calendar.getInstance();
        specificDate.set(Calendar.YEAR, 2022);
        specificDate.set(Calendar.MONTH, Calendar.APRIL);
        specificDate.set(Calendar.DAY_OF_MONTH, 26);
        specificDate.set(Calendar.HOUR, 10);
        specificDate.set(Calendar.MINUTE, 20);
        specificDate.set(Calendar.MINUTE, 40);

        System.out.println(specificDate.getTime());

    }


}
