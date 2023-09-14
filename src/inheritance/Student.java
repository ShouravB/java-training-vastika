package inheritance;

public class Student extends Person{

    private int rollNo;

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
