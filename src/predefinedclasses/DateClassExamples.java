package predefinedclasses;

public class DateClassExamples {
    public static void main(String[] args) {



        /*
            Date format to use yyyy-MM-ddTHH:mm:ss
          */
        DateUtils.calculatePostDuration("2024/07/18T12:12:39");
        System.out.println("*****************************************************************");
        DateUtils.calculatePostDuration("2022-07-18T12:12:39");
//        System.out.println(postedDate.until(currentDate, ChronoUnit.MILLIS));
//        System.out.println(postedDate);
    }
}
