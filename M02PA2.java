
public class M02PA2 
{
    public static void main(String[] args) 
    {
        //create myDate object
        MyDate hireDate = new MyDate(561555550000L); // example elapsed time

        //test objects for output
        Person person = new Person("Alex", "111 Main St", "111-111-1111", "Alex@test.com");
        Student student = new Student("Sam", "222 Main St", "222-222-2222", "Sam@test.com", Student.FRESHMAN);
        Employee employee = new Employee("Gabriel", "333 Main St", "333-333-3333", "Gabriel@test.com", "Room 303", 50000, hireDate);
        Faculty faculty = new Faculty("E'lorah", "444  Main St", "444-444-4444", "Elorah@test.com", "Room 404", 70000, hireDate, "9AM-5PM", "Professor");
        Staff staff = new Staff("Charlie", "555  Main St", "555-555-5555", "Charlie@test.com", "Room 505", 100000, hireDate, "Administrator");

        //system print for each object
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}


class Person //base class
{
    protected String name, address, phone, email; //initial values for person

    public Person(String name, String address, String phone, String email) 
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() 
    {
        return "Person: " + name;
    }
}

class Student extends Person //student subclass for person
{
    private String status; //adds their status as a student
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    

    public Student(String name, String address, String phone, String email, String status)
    {
        super(name, address, phone, email);  //from superclass
        this.status = status;
    }

    @Override public String toString() {return "Student: " + name + " / Status: " + status;} //override toString (added extra to remove "not used" error message)
}

class Employee extends Person //employee subclass for person
{
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) 
    {
        super(name, address, phone, email); //from superclass
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override public String toString() {return "Employee: " + name;}//override so it displays class name
}

class Faculty extends Employee //faculty subclass for employee which is a subclass of person
{
    private String officeHours, rank; //adds office hours and rank to person for employee

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) 
    {
        super(name, address, phone, email, office, salary, dateHired);  //from superclass
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override public String toString()
    {return "Faculty: " + name + " / Rank: " + rank + " / Office Hours: " + officeHours;} //override string method (added extra to remove "not used" error message)
}

class Staff extends Employee //staff subclass for employee which is a subclass of person
{
    private String title; //adds title to staff

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String title) 
    {
        super(name, address, phone, email, office, salary, dateHired); //from superclass
        this.title = title;
    }

    @Override  public String toString() {return "Staff: " + name + " / Title: " + title;} //override string method (added extra to remove "not used" error message)
}
