package arrays;

public class UpdateArrayUtils {

    private  UpdateArrayUtils(){}
    public static void reverseIntegerArray(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;

            end--;
        }
    }

    public static void reverseArrayOfString(String[] arrayOfStrings){

        int start =0 ;
        int end =arrayOfStrings.length-1;
        while(start < end){
            String temp = arrayOfStrings[start];
            arrayOfStrings[start] = arrayOfStrings[end];
            arrayOfStrings[end] = temp;

            start++;

            end--;
        }
    }
}
