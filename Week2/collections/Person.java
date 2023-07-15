package Week2.Collections;

import Week1.oop.Media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import  java.io.Serializable;
public class Person implements CompanyMember {
    public static int np = 0;
    public static List<Integer> pidList = new ArrayList<>();
    public static final Comparator<Person> COMPARE_BY_AGE = new PersonComparatorByAge();
    private int pid;
    private String name;
    private int age;
    private String role;

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public Person(){

        Person.setNp(Person.getNp() + 1);
    }

    public Person(int pid) {
        Person.setNp(Person.getNp() + 1);

        this.pid = pid;
    }

    public static int getNp() {
        return np;
    }

    public static void setNp(int np) {
        Person.np = np;
    }
    public Person(String name, int age, String role) {
        this.pid = generatePID();
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private int generatePID(){
        int start = 1;
        int end = 100;
        Random random = new Random();
        int randomeNumber = random.nextInt(end - start + 1) + start;
        while(Person.pidList.contains(randomeNumber)){
            randomeNumber += 1;
        }
        return randomeNumber;
    }

    public void sendNotification(String company, String event){
        System.out.println("from: " + company + " to: " + this.getName() +  "\n content: " + event);
    }
    @Override
    public String toString(){
        return this.getPid() + " " + this.getName() + " " + this.getAge() + " " + this.getRole();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Person){
            if(this.hashCode() == ((Person)o).hashCode() && this.getName().equals(((Person)o).getName())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.getPid();
    }
}
