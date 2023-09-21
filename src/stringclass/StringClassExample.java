package stringclass;

public class StringClassExample {
    public static void main(String[] args) {
        String a ="hello";
        String b ="no hello";
        String fName = "shourav";
        String lName= "Bhattarai";

        System.out.println(a.charAt(4)); //Find the index of a character in a string

        System.out.println(b.length()); //Find the length of the string

        System.out.println(lName.compareTo(fName)); //Compare string lexographically

        System.out.println(lName.compareToIgnoreCase(fName));

        System.out.println(fName.concat(lName));

        System.out.println(fName.contains("our"));

        System.out.println(fName.endsWith("av"));
        System.out.println();

        String intro = String.format("hello my name is %s and my last name is %s",fName, lName);

        System.out.println(intro);

        System.out.printf("hello my name is %s and last name is %s",fName, lName);
        System.out.println();

        System.out.println(intro.indexOf("my",9));

        String emptyString="";
        String nonEmptyString="    ";

        System.out.println(emptyString.isEmpty());
        System.out.println(nonEmptyString.isEmpty());
        System.out.println(nonEmptyString.trim().isEmpty());
        System.out.println(nonEmptyString.isBlank());

        System.out.println(intro.replace("my","his"));


    }
}
