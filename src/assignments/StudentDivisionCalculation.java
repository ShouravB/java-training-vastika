package assignments;

public class StudentDivisionCalculation {

    public static void main(String[] args) {
        int[] marks = {83,39,78,47,80};
        int sum = 0;
        boolean passedAll = true;
        for (int mark : marks) {
            if(mark < 40){
                passedAll = false;
                break;
            }

            sum += mark;
        }


        if(passedAll){
            float percent = ((float)sum / 500) * 100;
            if(percent >=80){
                System.out.println("Distinction");
            }else if(percent < 80 && percent >=60){
                System.out.println("Second Division");
            }else{
                System.out.println("Third Division");
            }

        }else{
            System.out.println("Sorry. You Failed.");
        }


    }
}
