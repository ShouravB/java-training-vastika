package inheritance;

public class Student extends Person{

    private int rollNo;

    public Student(){}

    public Student(String name, int age, String gender, int rollNo){
        super();
        setName(name);
        setAge(age);
        setGender(gender);
        this.rollNo=rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "rollNo=" + rollNo +
                '}';
    }
}
