package org.example;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person() {
    }

    private String job;

    public Person(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public String toString(){
        return this.getId() + " " + this.getName() + " " + this.getJob();
    }
}
