package com.bdg.hrmanagmentTool;


public class HRApplication {
    public static void main(String[] args) {

        Developer developer = new Developer(new SalaryInfo("card 1", 300000), "Developer Name", "Developer Surname", 20);
        Accounter accounter = new Accounter(new SalaryInfo("card-2", 3333), "Account Name", "Account Surname", 30);
        HRSpecialist specialist = new HRSpecialist(new SalaryInfo("card-3", 342), "Hr Specialist Name", "Hr Specialist Surname", 32);


        HRManagementTool tool = new HRManagementTool(3);
        tool.addEmployee(developer);
        tool.addEmployee(accounter);
        tool.addEmployee(specialist);
//        tool.removeByName("Account Name");


        System.out.println(tool.addEmployee(developer));

        System.out.println();
    }

}
