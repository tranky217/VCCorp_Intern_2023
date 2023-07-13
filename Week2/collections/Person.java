package Week2.collections;

import Week1.oop.Media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Person {
    public static int np = 0;
    public static List<Integer> pidList = new ArrayList<>();
    public static final Comparator<Person> COMPARE_BY_AGE = new PersonComparatorByAge();
    private int pid;
    private String name;
    private int age;
    private String role;

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
    @Override
    public String toString(){
        return this.getPid() + " " + this.getName() + " " + this.getAge() + " " + this.getRole();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Person){
            if(this.getPid() == ((Person)o).getPid()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
