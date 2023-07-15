package Week2.collections;

import java.io.Serializable;

public class Intern implements Serializable {
    private int temp_salary;

    public int getTemp_salary() {
        return temp_salary;
    }

    public Intern() {
    }

    public int setTemp_salary(int temp_salary) {
        this.temp_salary = temp_salary;
        return temp_salary;
    }

    public Intern(int temp_salary) {
        this.temp_salary = temp_salary;
    }
}
