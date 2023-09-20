package predefinedclasses;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public final class DateUtils {

    private  DateUtils(){}

    public static void calculatePostDuration(String postDate){

        try {
            LocalDateTime currentDate = LocalDateTime.now();
            LocalDateTime postedDate = LocalDateTime.parse(postDate);
            if (currentDate.isBefore(postedDate)) {
                System.out.println("The post is from the future");
            } else if (postedDate.equals(currentDate)) {
                System.out.println("Just Now");
            } else if (postedDate.until(currentDate, ChronoUnit.YEARS) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.YEARS) + " years ago");
            } else if (postedDate.until(currentDate, ChronoUnit.MONTHS) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.MONTHS) + " months ago");
            } else if (postedDate.until(currentDate, ChronoUnit.DAYS) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.DAYS) + " days ago");
            } else if (postedDate.until(currentDate, ChronoUnit.HOURS) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.HOURS) + " hours ago");
            } else if (postedDate.until(currentDate, ChronoUnit.MINUTES) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.MINUTES) + " minutes ago");
            } else if (postedDate.until(currentDate, ChronoUnit.SECONDS) != 0) {
                System.out.println(postedDate.until(currentDate, ChronoUnit.SECONDS) + " seconds ago");
            } else {
                System.out.println("Let me check the duration");
            }
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Invalid date format. Please enter date in format of yyyy-MM-ddTHH:mm:ss");
        }

        //System.out.println(Duration.between(postedDate,currentDate));

    }
}
