package com.bdg.Composition;

public class Person {
    private Job job;

    public Person(){
        this.job = new Job();
        job.getSalary();
        job.getId();
    }

    public Job getJob() {
        return job;
    }
    public int getSalary(){
        return job.getSalary();
    }
}
