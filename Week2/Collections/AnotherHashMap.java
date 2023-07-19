package Week2.Collections;

import java.util.*;

public class AnotherHashMap {
    public static void main(String[] args) {
        Person p = new Person("hella", 12, "intern");
        Person em = new Employee("hhhhss", 15, "manager", 1000);
        Person p1 = new Person("sth", 22, "employee");
        Person p2 = null;

        Employee mamanger = new Employee(1, "hey", 1000);

        Map<Person, List<Person>> pMap = new HashMap<>();
        List<Person> pList = new ArrayList<>();
        pList.addAll(Arrays.asList(p, em, p1, p2));

        pMap.put(mamanger, pList);
        System.out.println(pMap);
    }
}
