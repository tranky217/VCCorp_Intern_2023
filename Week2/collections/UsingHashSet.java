package Week2.collections;

import java.util.*;

public class UsingHashSet {
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
        pList.add(null);

        pList.add(2, em);

        System.out.println(pList);

        Set<Person> pSet = new HashSet<>(pList);
        System.out.println(pSet);

        //operation on set
        // adding to a set -> how to check for present
        Person pset = new Person("ky", 22, "intern");
        Person pset2 = new Person("hello", 12, "dasda");
        pSet.add(pset);
        pSet.add(pset2);

        System.out.println(pSet);
        // remove -> how to check for present
        pSet.remove(null);

        Person testP = new Person(1, "hashcode");
        pSet.add(testP);
        System.out.println("size after adding person pid 1:" + pSet.size());

        pSet.add(new Person(1, "hashcode"));
        System.out.println("size after duplicate values obj: " + pSet.size());

        boolean res = pSet.remove(new Person(1, "hashcode"));
        boolean res2 = pSet.remove(testP);
        System.out.println("after remove:" + pSet.size());
        System.out.println(res);

        // loop through
        Iterator<Person> i = pSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // searching
        pSet.add(new Person(1, "aaa"));
        System.out.println(pSet.contains(new Person(1, "aaa")));


    }
}
