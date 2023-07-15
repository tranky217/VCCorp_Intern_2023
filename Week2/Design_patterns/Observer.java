package Week2.design_patterns;

import Week2.collections.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Observer {
    public static void main(String[] args) {
        Person p = new Person("hella", 12, "intern");
        Person em = new Employee("hhhhss", 15, "manager", 1000);
        Person p1 = new Person();
        Person p2 = null;

        Company newCompany = new Company("abc");
        newCompany.accept(p);
        newCompany.accept(em);
        newCompany.accept(p1);

        newCompany.notify("year end party");

    }
}
