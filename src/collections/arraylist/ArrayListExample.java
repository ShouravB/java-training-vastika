package collections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("SHourav");
        names.add("Sameer");
        names.add("taman");
        names.add(0,"yugesh");
        names.add("sameer");
        names.add("bikash");

        System.out.println(names);

        names.set(1,"shourav");
        names.set(2,"sameer");
        System.out.println(names);
        System.out.println(names.indexOf("sameer"));
        System.out.println(names.get(2));
        System.out.println(names.contains("sHouRav".toLowerCase()));
        System.out.println(names.lastIndexOf("sameer"));
        names.remove(names.lastIndexOf("sameer"));
        System.out.println(names);

        ArrayList<String> blackListed = new ArrayList<>();
        blackListed.add("sameer");
        blackListed.add("yugesh");

        System.out.println(names);
        //System.out.println(names.removeAll(blackListed));
        System.out.println(names);
        System.out.println(names.size());

        Collections.reverse(names);
        System.out.println(names);



    }
}
