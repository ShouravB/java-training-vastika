package stringclass;

public class ImmutableClassDemo {
    public static void main(String[] args) {
        CustomImmutableClass object = new CustomImmutableClass("Taman",32);
        System.out.println(object.getName());
        System.out.println(object.getAge());

        object = new CustomImmutableClass("shourav", 30);
        System.out.println(object.getName());
        System.out.println(object.getAge());
    }
}
