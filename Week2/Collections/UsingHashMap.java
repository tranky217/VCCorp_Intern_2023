package Week2.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {
    public static void main(String[] args){
        Person p = new Person("hella", 12, "intern");
        Person em = new Week2.Collections.Employee("hhhhss", 15, "manager", 1000);
        Person p1 = new Person();
        Person p2 = null;

        // hashmap
        Map<Integer, Person> pMap = new HashMap<>();
        pMap.put(100, p);
        pMap.put(200, em);
        pMap.put(300, p1);
        pMap.put(1, p2);
        pMap.put(null, p);

        System.out.println(pMap);

        // get
        System.out.println(pMap.get(100));

        // contains
        System.out.println(pMap.containsKey(100));

        System.out.println(pMap.containsValue(p));
        Person testP = new Person(1, "hashcode");
        pMap.put(testP.getPid(), testP);
        System.out.println(pMap.containsValue(new Person(1, "hashcode")));
        // based on equal and hashcode

        // remove
        System.out.println(pMap.remove(100));
        System.out.println(pMap);

        // modify
        System.out.println(pMap.replace(300, new Person(300, "new person")));
        System.out.println(pMap.size());

        // iterate over map
        Set<Integer> setKey = pMap.keySet();
        Iterator<Integer> i = setKey.iterator();
        while(i.hasNext()){
            System.out.println(pMap.get(i.next()));
        }
        // entry set

        Set<Map.Entry<Integer, Person>> entries = pMap.entrySet();
        for(Map.Entry<Integer, Person> e: entries){
            System.out.println(e);
        }

    }
}
