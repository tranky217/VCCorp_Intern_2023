package Week2.collections;

import java.util.*;

public class UsingList {
    public static void main(String[] args) {
        Person p = new Person("hella", 12, "intern");
        Person em = new Employee("hhhhss", 15, "manager", 1000);
        Person p1 = new Person();
        Person p2 = null;
        // add methods
        List<Person> pList = new ArrayList<>();
        pList.add(p);
        pList.add(em);
        pList.add(p1);
        pList.add(p2);

        pList.add(2, em);

        System.out.println(pList);

        // get methods
        Person res = pList.get(3);
        System.out.println(res.toString());

        // set methods

        Person p3 = new Person("badman", 20, "student");
        pList.set(3, p3); // replace pList[3] -> p3
        System.out.println(pList.get(3));

        // remove methods
        // by index

        System.out.println(pList.size());
        pList.remove(pList.size() - 1);
        System.out.println(pList.size());
        // by object, effect by equals method
        Person removeObj = em;
        pList.remove(removeObj);
        System.out.println(pList);

        // iterate over a list
        Iterator<Person> iterator = pList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // searching or checking for existence
        System.out.println(pList.contains(p3));
        Person containsP = new Person(1);
        pList.add(containsP);
        Person containDup = new Person(1);
        System.out.println(pList);
        System.out.println(pList.contains(containDup));

        // indexof
        System.out.println(pList.indexOf(containDup));

        // sorting
        System.out.println("before sorting: " + pList);
        Collections.sort(pList, Person.COMPARE_BY_AGE);
        System.out.println("after sorting: " + pList);


    }
}
