package Week2.Collections;

public class Employee extends Person{
    private int salary;

    public Employee(int salary) {
        super();
        this.salary = salary;
    }

    public Employee(String name, int age, String role, int salary) {
        super(name, age, role);
        this.salary = salary;
    }

    public Employee(){
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.getSalary();
    }
}
