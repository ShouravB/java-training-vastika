package assignment;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public final class StringUtils {

    private StringUtils(){}

    /*
    Function to check whether given string is palindromic or not
     */
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        str =str.trim();

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }

        return true;
    }

    /*
    Function to count the occurance of particular character in a given string
     */

    public static int countOccuranceOfAChar(String str, char c){
        if(str.isBlank() || str.isEmpty()){
            return 0;
        }

        str = str.toLowerCase();
        int count =0;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }

        return count;
    }

    /*
    Function to check the anagrams
     */

    public static boolean checkAnagramString(String str1, String str2){

        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for(char c : str1.toCharArray()){

            countMap.put(c,countMap.getOrDefault(c,0)+1);

        }

        for(char c : str2.toCharArray()){
            if(!countMap.containsKey(c)){
                return false;
            }

            int count = countMap.get(c);
            if(count == 1){
                countMap.remove(c);
            }else{
                countMap.put(c, count-1);
            }
        }

        return countMap.isEmpty();

    }

    private static int mostKChars(String s, int k)
    {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0, left = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(left),
                        map.getOrDefault(s.charAt(left), 0)
                                - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            num += i - left + 1;
        }
        return num;
    }
   public static int exactKChars(String s, int k)
    {
        return mostKChars(s, k) - mostKChars(s, k - 1);
    }


    /*
    Function to calculate the sum of two very long integer string
     */

    public static String calculateSum (String str1, String str2){

        BigInteger sum;
        String result ="";
        try{
            BigInteger integer1 = new BigInteger(str1.trim());
            BigInteger integer2 = new BigInteger(str2.trim());
            sum = integer1.add(integer2);
            result = sum.toString();

        }catch(NumberFormatException e){
            System.out.println("Invalid number representation");;
        }
        return result;



    }


}
