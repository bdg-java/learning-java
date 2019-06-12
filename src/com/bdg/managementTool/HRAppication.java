package com.bdg.managementTool;

import java.util.ArrayList;
import java.util.List;

public class HRAppication {
    public static void main(String[] args) {


//        Employee employee = null;
//
//        new HRManagementTool().addEmployee(employee);

        Developer developer = new Developer(new SalaryInfo("card-3", 300000), "Developer", "Developer Surname", 20);
        Accounter accounter = new Accounter(new SalaryInfo("card-2", 3333), "Account ", "Account Surname", 30);
        HRSpecialist specialist = new HRSpecialist(new SalaryInfo("card-3", 342), "HrSpecialist", "Hr Specialist Surname", 32);
        Employee[] resizedEmployee = new Employee[5];

        Profession profess = new Profession("Developer");


            HRManagementTool tool = new HRManagementTool(4);

        tool.addEmployee(developer);
        tool.addEmployee(accounter);
        tool.addEmployee(specialist);
        tool.removeEmployee(developer);
        System.out.println(resizedEmployee.length);
        System.out.println(tool.removeEmployee(developer));

        System.out.println( profess.name());
        System.out.println();

        System.out.println("removeByNames");

        tool.findByProfession(profess);

        tool.removeByName("Developer");








    }
}
