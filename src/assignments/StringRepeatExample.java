package assignments;

public class StringRepeatExample {
    public static void main(String[] args) {
        int n= 6;
        String output;

        if(n % 2 != 0){
            output = "a".repeat(n);
        }else{
            output="a".repeat(n-1) + "b";
        }

        System.out.println(output);
    }
}
