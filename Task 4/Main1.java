package Lab4;
class TeamMember {
    protected String name;
public TeamMember(String name) {
        this.name = name;
    }
public void showInfo() {
        System.out.println("Name: " + name);
    }
}
class Employee extends TeamMember {

    public Employee(String name) {
        super(name);
    }
    public void calculateBonus() {
        System.out.println(name + " receives a standard employee bonus.");
    }
}
class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }
public void work() {
        System.out.println(name + " is working as a contractor.");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        Contractor con = new Contractor("Bob");
        
        emp.showInfo();
        emp.calculateBonus();
        System.out.println();
        con.showInfo();
        con.work();
    }
    }


