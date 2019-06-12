package com.bdg.agharibyan.hrmanagementtoolhomework;

import com.bdg.agharibyan.umlhomework.employee.Employee;

public class HRApplication {

    public static void main(String[] args) {

        Developer developer = new Developer(new SalaryInfo("card-1", 300000), "Developer Name", "Developer Surname", 20);
        Accounter accounter = new Accounter(new SalaryInfo("card-2", 3333), "Account Name", "Account Surname", 30);
        HRSpecialist specialist = new HRSpecialist(new SalaryInfo("card-3", 342), "Hr Specialist Name", "Hr Specialist Surname", 32);


        HRManagementTool tool = new HRManagementTool(3);

        tool.addEmployee(developer);
        tool.addEmployee(accounter);
        tool.addEmployee(specialist);

        MarketSpecialist marketSpecialist1 = new MarketSpecialist(new SalaryInfo("card-4", 2222), "Market Specialist Name", "Market Specialist Surname", 25);
        MarketSpecialist marketSpecialist2 = new MarketSpecialist(new SalaryInfo("card-4", 2000),"Market Specialist2 Name", "Market Specialist Surname", 27);

        tool.addEmployee(marketSpecialist1);
        tool.addEmployee(marketSpecialist2);

        tool.findByProfession(accounter.profession());

        tool.removeEmployee(marketSpecialist2);

        tool.removeByName("MarketSpecialist Name");

        tool.removeByNames("Developer Name","Account Name", "Ani");

        tool.removeWithSalaryRange(2000,22222222);

//        tool.contains(new Employee(new SalaryInfo("card-2", 3333), "Account Name", "Account Surname", 30));
//ayspes error e talis, SalaryInfoyi pokharen ID e uzum,
//        tool.contains(new Employee(111111, "Account Name", "Account Surname", 30));
//ayspes error e talis, can not be aaplied

        tool.findByName("Account Name");

        tool.totalSalary();

    }
}
