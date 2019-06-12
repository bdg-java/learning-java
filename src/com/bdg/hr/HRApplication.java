package com.bdg.hr;

public abstract class HRApplication {

    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("122162",180_000);
        Developer developer = new Developer(salaryInfo,"Lev" ,"Tolstoy" ,227);

        new HRManagementTool().addEmployee(developer);


    }
}