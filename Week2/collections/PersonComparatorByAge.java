package Week2.Collections;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person> {
    public PersonComparatorByAge() {
    }

    // sort by age first then sort by name alphabetically
    @Override
    public int compare(Person p1, Person p2){
        if(p1.getAge() != p2.getAge()){
            return Integer.compare(p1.getAge(), p2.getAge());
        }else{
            String name1 = p1.getName();
            String name2 = p2.getName();
            if(name1.compareTo(name2) != 0){
                return name1.compareTo(name2);
            }
            return 0;
        }
    }
}
