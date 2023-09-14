package inheritance;

public class Staff extends Person{

    private String jobPosition;

    public Staff(){}

    public Staff(String jobPosition){
        super();
        this.jobPosition = jobPosition;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}
