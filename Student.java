import java.util.Arrays;
import java.util.List;

public class Student extends Person {
    private String status; //freshman, junior, sophomore, senior
    List<String> years = Arrays.asList("freshman","sophomore","junior","senior");
    public Student(String name, String address, String phoneNumber, String eMail, int year) {
        super(name, address, phoneNumber, eMail);
        this.status = years.get(year);
    }
    @Override
    public String toString() {
        return super.toString() + " | " + status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int year) {
        this.status = years.get(year);
    }
}
