import java.util.Arrays;
import java.util.List;

abstract class Employee extends Person{
    private String department;
    private String salary;
    private String dateHired; //"MM/DD/YYYY"

    public Employee(String name, String address, String phoneNumber, String eMail, String department, String salary, String dateHired) {
        super(name, address, phoneNumber, eMail);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return super.toString() + " | " + department + " | " + salary + " | " + dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank; //junior, senior
    List<String> ranks = Arrays.asList("junior","senior");
    public Faculty(String name, String address, String phoneNumber, String eMail, String department, String salary, String dateHired,
                   String officeHours, int rank) {
        super(name, address, phoneNumber, eMail, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = ranks.get(rank);
    }
    @Override
    public String toString() {
        return super.toString() + " | " + officeHours + " | " + rank;
    }
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = ranks.get(rank);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String eMail, String department, String salary, String dateHired,
                 String title) {
        super(name, address, phoneNumber, eMail, department, salary, dateHired);
        this.title = title;
    }
    @Override
    public String toString() {
        return super.toString() + " | " + title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}