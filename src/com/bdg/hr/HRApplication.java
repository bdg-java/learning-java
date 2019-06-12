package com.bdg.hr;

public abstract class HRApplication {

    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("122162",180_000);
        Developer developer = new Developer(salaryInfo,"Lev" ,"Tolstoy" ,227);

        HRManagementTool hr = new HRManagementTool();
        hr.addEmployee(developer);

        SalaryInfo salaryInfo1 = new SalaryInfo("122162",180_000);
        Developer developer1 = new Developer(salaryInfo1,"da ","da ",32);
        hr.addEmployee(developer1);
        System.out.println(hr.totalSalary());
//        System.out.println(new HRManagementTool().totalSalary());


    }
}