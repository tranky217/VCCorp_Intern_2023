package Week2.design_patterns;

import Week2.collections.Company;
import Week2.collections.Employee;
import Week2.collections.Intern;

public class Adapter {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "a", 1000);
        Employee e2 = new Employee(2, "b", 2000);
        Intern i1 = new Intern();

        Company x = new Company("x");

        x.accept(e1);
        x.accept(e2);

        x.paySalary();
        // can not pay money for intern
        InternToEmpoyee internToEmpoyee = new InternToEmpoyee(i1);
        x.paySalary(internToEmpoyee);

    }
}
