package com.bdg.hr;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

//        new HRManagementTool().findByProfession(new Profession("Developer"));
//        Developer developer = new Developer(new SalaryInfo("5181800000124589", 10), "John", "Smith", 10);
        Employee developer1 = new Developer(new SalaryInfo("5181800000124589", 100), "John", "Smith", 20);
        Employee developer2 = new Developer(new SalaryInfo("5181800000124588", 200), "Jack", "Black", 21);
        Employee manager1 = new Manager(new SalaryInfo("5181800000124587", 200), "Ann", "Black", 21);
        Employee marketspec1 = new MarketingSpecialist(new SalaryInfo("5181800000124585", 50), "Mary", "White", 20);
        Employee acc1 = new Accountant(new SalaryInfo("5181800000124581", 150), "Jane", "White", 30);

        HRManagementTool button = new HRManagementTool();

        System.out.println(button.addEmployee(developer1));
        System.out.println(button.addEmployee(developer2));
        System.out.println(button.addEmployee(manager1));
        System.out.println(button.addEmployee(marketspec1));
        System.out.println(button.addEmployee(acc1));
        System.out.println(button.totalSalary());
//        System.out.println(Arrays.toString(button.removeByName("Jane")));
//        System.out.println(Arrays.toString(button.findByName("Ann")));
//        System.out.println(Arrays.toString((button.removeWithSalaryRange(70, 155))));
//        System.out.println(Arrays.toString(button.findByCardNumber("5181800000124581")));
        System.out.println(Arrays.toString(button.findEmployeeWithSalaryRange(10, 101)));

    }
}
