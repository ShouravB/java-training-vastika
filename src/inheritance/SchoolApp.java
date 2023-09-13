package inheritance;

public class SchoolApp {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Shourav Bhattarai");
        student1.setAge(25);
        student1.setGender("male");
        student1.setRollNo(11);

        Student student2 = new Student();
        student2.setName("Sameer Bhattarai");
        student2.setAge(22);
        student2.setGender("male");
        student2.setRollNo(9);

        System.out.println(student1);
        System.out.println("**************************************************************");
        System.out.println(student2);
    }
}
