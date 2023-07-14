package Week2.collections;

public class Employee extends Person{
    private int salary;

    public Employee(int pid, String name, int salary) {
        super(pid, name);
        this.salary = salary;
    }

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

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.getSalary();
    }

    public int receiveSalary(){
        return this.setSalary(this.getSalary() + 100);
    }

}
