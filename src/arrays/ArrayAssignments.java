package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAssignments {

    public static void main(String[] args) {
        int[] arr = {11,19,34,5,16};
        String[] arr1 = {"hari","ram","shyam","krish","mohan", "taman"};

       // String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

        System.out.println(Arrays.toString(ArraysUtils.reverseArrayOfInteger(arr)));
        System.out.println("*****************************************************************************************");
        System.out.println();
        System.out.println(Arrays.toString(ArraysUtils.reverseArrayOfString(arr1)));
        System.out.println("*****************************************************************************************");
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ArraysUtils.leftRotationOfIntegerArray(arr,4)));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ArraysUtils.rightRotationOfIntegerArray(arr,3)));

        System.out.println("*****************************************************************************************");
        System.out.println();



        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ArraysUtils.leftRotationOfStringArray(arr1, 4)));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ArraysUtils.rightRotationOfStringArray(arr1, 4)));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr));
        UpdateArrayUtils.reverseIntegerArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr1));
        UpdateArrayUtils.reverseArrayOfString(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr));
        UpdateArrayUtils.rotateIntegerArrayRight(arr,2);
        System.out.println(Arrays.toString(arr));

        System.out.println("*****************************************************************************************");
        System.out.println();

        System.out.println(Arrays.toString(arr));
        UpdateArrayUtils.rotateIntegerArrayLeft(arr,2);
        System.out.println(Arrays.toString(arr));

        System.out.println("*****************************************************************************************");
        System.out.println();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println(Arrays.toString(days));
        UpdateArrayUtils.rotateStringArrayLeft(days,2);
        System.out.println(Arrays.toString(days));

        System.out.println(Arrays.toString(days));
        UpdateArrayUtils.rotateStringArrayRight(days,1);
        System.out.println(Arrays.toString(days));





    }
}
