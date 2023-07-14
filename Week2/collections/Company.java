package Week2.collections;

import Week2.collections.Person;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Person> staff;

    public void notify(String event){
        for(Person p: staff){
            p.sendNotification(this.name, event);
        }
    }

    public void paySalary(Employee e){
        System.out.println(e.receiveSalary());
    }
    public void paySalary(){
        for(Person p: staff){
            System.out.println(((Employee)p).receiveSalary());
        }
    }
    public void accept(Person p){
        this.staff.add(p);
    }

    public Company(String name) {
        this.staff = new ArrayList<>();
        this.name = name;
    }

    public Company(String message, List<Person> staff) {
        this.name = message;
        this.staff = staff;
    }

    public Company(){
        this.staff = new ArrayList<>();
    }

}
