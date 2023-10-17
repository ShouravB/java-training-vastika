package assignment;

public class AssignmentMainClass {
    public static void main(String[] args) {

        String input = "interview bit";
        System.out.println(StringUtils.isPalindrome("abcba"));
        System.out.println(StringUtils.countOccuranceOfAChar("InterviewBitE",'e'));

        System.out.println(input.charAt(2));

        System.out.println(StringUtils.checkAnagramString("listen","silenT"));

        System.out.println(StringUtils.exactKChars("aba",2));

        System.out.println(StringUtils.calculateSum("3333311111111111","44422222221111"));

        System.out.println(StringUtils.calculateSum("3333311111111111",""));
    }
}
