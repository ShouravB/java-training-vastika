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

    private static void reverseIntegerArray(int[] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;

            end--;
        }
    }

    public static void rotateIntegerArrayRight(int[] integerArray, int pos){
        int length = integerArray.length;

        pos = pos % length;

        reverseIntegerArray(integerArray,0,length-1);
        reverseIntegerArray(integerArray,0,pos-1);
        reverseIntegerArray(integerArray,pos,length-1);
    }

    public static void rotateIntegerArrayLeft(int[] integerArray, int pos){
        int length = integerArray.length;

        pos = pos % length;

        reverseIntegerArray(integerArray,0,length-1);
        reverseIntegerArray(integerArray,0,length-pos-1);
        reverseIntegerArray(integerArray,length-pos,length-1);
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

    private static void reverseArrayOfString(String[] arrayOfStrings, int start, int end){

        while(start < end){
            String temp = arrayOfStrings[start];
            arrayOfStrings[start] = arrayOfStrings[end];
            arrayOfStrings[end] = temp;

            start++;

            end--;
        }
    }


    public static void rotateStringArrayLeft(String[] stringArray, int pos){
        int length = stringArray.length;

        pos =pos % length;
        reverseArrayOfString(stringArray);
        reverseArrayOfString(stringArray,0,length-pos-1);
        reverseArrayOfString(stringArray,length-pos,length-1);
    }

    public static void rotateStringArrayRight(String[] stringArray, int pos){
        int length = stringArray.length;

        pos =pos % length;
        reverseArrayOfString(stringArray);
        reverseArrayOfString(stringArray,0,pos-1);
        reverseArrayOfString(stringArray,pos,length-1);
    }


}
