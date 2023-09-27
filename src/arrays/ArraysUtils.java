package arrays;

//import java.util.Arrays;

public final class ArraysUtils {

    private ArraysUtils(){}

    public static int[] reverseArrayOfInteger(int[] integerArray){
        int[] reversedArray = new int[integerArray.length];
        //int reversedArray[integerArray.length];
        int reversedArrayIndex = integerArray.length -1;

        for (int j : integerArray) {
            reversedArray[reversedArrayIndex] = j;
            reversedArrayIndex--;
        }

        return reversedArray;
    }

    public static int[] leftRotationOfIntegerArray(int[] integerArray, int pos){
        int[] rotatedArray = new int[integerArray.length];
        int indexOfRotatedArray = 0;

        for(int i = pos; i < integerArray.length; i++ ){
            rotatedArray[indexOfRotatedArray] = integerArray[i];
            indexOfRotatedArray++;
        }

        for(int i = 0; i < pos; i++){
            rotatedArray[indexOfRotatedArray] = integerArray[i];
            indexOfRotatedArray++;
        }

        return rotatedArray;
    }

    public static int[] rightRotationOfIntegerArray(int[] integerArray, int pos){
        int[] rotatedArray = new int[integerArray.length];
        int indexOfRotatedArray = pos;

        for(int i = 0; i < integerArray.length-pos; i++){
            rotatedArray[indexOfRotatedArray] = integerArray[i];
            indexOfRotatedArray++;
        }


        for(int i = pos -1 ; i >= 0; i-- ) {
            rotatedArray[i] = integerArray[--indexOfRotatedArray];

        }

        return rotatedArray;
    }

    public static String[] reverseArrayOfString(String[] arrayOfStrings){
        StringBuilder sb = new StringBuilder();
        for(int i = arrayOfStrings.length - 1; i>=0; i--){
            sb.append(arrayOfStrings[i]);
            sb.append(",");
        }
        //System.out.println(sb.substring(0,sb.length()-1));
        return sb.substring(0, sb.length()-1).split(",");
    }

//    public static String[] leftRotationOfStringArray(String[] arrayOfString, int pos){
//        StringBuilder sb = new StringBuilder();
//        for (int i = pos; i< arrayOfString.length ; i++){
//            sb.append(arrayOfString[i]);
//            sb.append(",");
//        }
//
//        for (int i = arrayOfString.length-pos-1; i>=0  ; i--){
//            sb.append(arrayOfString[i]);
//            sb.append(",");
//        }
//
//        //System.out.println(sb.toString());
//        return  sb.toString().split(",");
//    }
//
//    public static String[] rightRotationOfStringArray(String[] arrayOfString, int pos){
//        StringBuilder sb = new StringBuilder();
//        for (int i = pos+1 ; i< arrayOfString.length ; i++){
//            sb.append(arrayOfString[i]);
//            sb.append(",");
//        }
//
//        for (int i = 0; i< pos ; i++){
//            sb.append(arrayOfString[i]);
//            sb.append(",");
//        }
//
//        //System.out.println(sb.toString());
//        return  sb.toString().split(",");
//    }
}
