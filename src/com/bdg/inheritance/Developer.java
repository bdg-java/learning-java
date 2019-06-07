package com.bdg.inheritance;

public class Developer extends Employee {

    private String programmingLang;

    public Developer(String name, int salary, String programmingLang) {
        super(name, salary);
        this.programmingLang = programmingLang;
    }

    public String name() {
        return name;
    }

    public String getProgrammingLang() {
        return this.programmingLang;
    }
}
