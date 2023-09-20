package stringclass;

public class ImmutableClassDemo {
    public static void main(String[] args) {

        /*
        Immutable class in Java means that once an object is created for that class, we cannot
        change the content. All the wrapper classes are immutable.

         */

        /*
        Steps to create immutable class
        1. Declare the class final.
        2. All members should be declared private and final.
        3. Create a parameterized constructor to initialize all fields.
         */



        CustomImmutableClass object = new CustomImmutableClass("Taman",32);
        System.out.println(object.getName());
        System.out.println(object.getAge());

        object = new CustomImmutableClass("shourav", 30);
        System.out.println(object.getName());
        System.out.println(object.getAge());
    }
}
