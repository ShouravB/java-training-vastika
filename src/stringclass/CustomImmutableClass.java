package stringclass;

public final class CustomImmutableClass {
    private final String name;
    private  final int age;

    public CustomImmutableClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
