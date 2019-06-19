package com.bdg.hr;

public abstract class HRApplication {

    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("122162",180_000);
        Developer developer = new Developer(salaryInfo,"Lev" ,"Tolstoy" ,227);

        HRManagementTool hr = new HRManagementTool();
        hr.addEmployee(developer);

        SalaryInfo salaryInfo1 = new SalaryInfo("122162",50_000);
        Developer developer1 = new Developer(salaryInfo1,"da ","da ",32);
        hr.addEmployee(developer1);
        System.out.println(hr.totalSalary());

        SalaryInfo salaryInfo2 = new SalaryInfo("122162",100_000);
        Developer developer2 = new Developer(salaryInfo2,"Lev" ,"Tolstoy" ,227);

       hr.addEmployee(developer2);

        SalaryInfo salaryInfo3 = new SalaryInfo("122162",300_000);
        Developer developer3 = new Developer(salaryInfo3,"Lev" ,"Tolstoy" ,227);


        hr.addEmployee(developer);

        SalaryInfo salaryInfo4 = new SalaryInfo("122162",1000_000);
        Developer developer4 = new Developer(salaryInfo4,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer4);

        SalaryInfo salaryInfo5 = new SalaryInfo("122162",220_000);
        Developer developer5 = new Developer(salaryInfo5,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer5);

        SalaryInfo salaryInfo6 = new SalaryInfo("122162",195_000);
        Developer developer6 = new Developer(salaryInfo6,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer6);

        SalaryInfo salaryInfo7 = new SalaryInfo("122162",180_000);
        Developer developer7 = new Developer(salaryInfo7,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer7);

        SalaryInfo salaryInfo8 = new SalaryInfo("122162",180_000);
        Developer developer8 = new Developer(salaryInfo8,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer8);

        SalaryInfo salaryInfo9 = new SalaryInfo("122162",180_000);
        Developer developer9 = new Developer(salaryInfo9,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer9);

        SalaryInfo salaryInfo10 = new SalaryInfo("122162",180_000);
        Developer developer10 = new Developer(salaryInfo10,"Lev" ,"Tolstoy" ,227);

        hr.addEmployee(developer10);

        SalaryInfo salaryInfo11 = new SalaryInfo("122162",350_000);
        Developer developer11 = new Developer(salaryInfo11,"LYOV" ,"Tolstoy" ,227);

        hr.addEmployee(developer11);

        System.out.println(hr.totalSalary());
        System.out.println( hr.findEmployeeWithSalaryRange(300000,2000000));
        hr.increaseSalary(developer1,80000);
        System.out.println(developer1.info.getSalary());




    }
}