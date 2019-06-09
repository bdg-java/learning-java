package Classed;

public class Employee {

    private int id ;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee ( int id, String firstName, String lastName, int salary){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getid (){
        return this.id;
    }

    public String getfirstName (){
        return this.firstName;
    }

    public String getlastName (){
        return this.lastName;
    }

    public int getsalary (){
        return this.salary;
    }

    public void setsalaty (int salary){
        this.salary = salary;
    }

    public int getAnnulSalary(){
        return this.salary * 12;

    }

    public int raiseSalary (int percent){
        return salary += salary * percent / 100;

    }

    public String toString (){
        return " Employee :"  + this.id + ", " + this.firstName + " , " + this.lastName + " , " + this.salary + "";

    }


}

