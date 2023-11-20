import java.util.ArrayList;

public class TestSchoolRecords {
    public static ArrayList<Person> employeeList(ArrayList<Person> inList) { //takes in list of people, returns only those who are instances of the employee abstract class
        ArrayList<Person> outList = new ArrayList<>();
        for (Person i: inList) {
            if (i instanceof Employee) {
                outList.add(i);
            }
        }
        return outList;
    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>(); //new arraylist
        //adding people to it
        people.add(new Student("Mia", "1525 Awesome Lane", "9708252191", "mia1234@gmail.com", 2));
        people.add(new Student("Ryan", "111 Banana St.", "9991234567", "ryanmurphy@gmail.com", 3));
        people.add(new Staff("Wachel","123 Employee st.", "1237934030","Wachelgymlad@teacher.com","Outside","2,000","12/27/2018","Lead Staff"));
        people.add(new Staff("Hazel","125 Employee st.", "1237934031","imhazeluyay@teacher.com", "Dean","100,000","09/11/2001","Dean of Students"));
        people.add(new Faculty("John","123 Faculty st.", "1234567890","johnteacher@teacher.com", "Math","9,000","05/17/2002","Mon 6-10",1));
        people.add(new Faculty("Rachel","123 Faculty st.", "1237934029","rachelteacher@teacher.com", "Music","10,000","05/07/2008","Fri 6-10",0));

        //to cycle through and  print out the list
        for (Person i : people) {
            System.out.println(i.toString());
        }
    }
}