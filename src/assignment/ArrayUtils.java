package assignment;


import java.util.Arrays;

public final class ArrayUtils {

    private ArrayUtils(){}

    /*
    Find max and min in array
     */
    public static int findMax(int[] integers){
        int res = integers[0];
        for(int i = 1 ; i<integers.length; i++){
            res = Math.max(integers[i], res);
        }
        return res;
    }

    public static int findMin(int[] integers){
        int res = integers[0];
        for(int i = 1 ; i<integers.length; i++){
            res = Math.min(integers[i], res);
        }
        return res;
    }

    public static  int findMaxWithArrayStream(int[] integers){
        if(integers.length == 0){
            return 0;
        }
        return Arrays.stream(integers).max().getAsInt();
    }

    public static  int findMinWithArrayStream(int[] integers){
        if(integers.length == 0){
            return 0;
        }
        return Arrays.stream(integers).min().getAsInt();
    }

    /*
    reverse array of integer
     */


}
