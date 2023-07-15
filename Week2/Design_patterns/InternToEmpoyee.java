package Week2.Design_patterns;
import Week2.collections.*;
public class InternToEmpoyee extends Employee {
    private Intern intern;

    public InternToEmpoyee(Intern i){
        this.intern = i;
    }

    @Override
    public int receiveSalary() {
        return intern.setTemp_salary(super.receiveSalary() - 90);
    }
}
