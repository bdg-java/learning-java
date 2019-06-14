package com.bdg.agharibyan.hrmanagementtoolhomework;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

        Developer developer = new Developer(new SalaryInfo("card-1", 300000), "Developer Name", "Developer Surname", 20);
        Accounter accounter = new Accounter(new SalaryInfo("card-2", 3333), "Accounter Name", "Account Surname", 30);
        HRSpecialist hrspecialist = new HRSpecialist(new SalaryInfo("card-3", 342), "Hr Specialist Name", "Hr Specialist Surname", 32);


        HRManagementTool tool = new HRManagementTool(3);

        System.out.println("first employee added:"+ tool.addEmployee(developer));
        developer.addReferenceNumber(1);
        System.out.println("second employee added:"+ tool.addEmployee(accounter));
        accounter.addReferenceNumber(2);
        System.out.println("third employee added:"+ tool.addEmployee(hrspecialist));
        hrspecialist.addReferenceNumber(3);

        MarketSpecialist marketSpecialist1 = new MarketSpecialist(new SalaryInfo("card-4", 2222), "Market Specialist Name", "Market Specialist Surname", 25);
        MarketSpecialist marketSpecialist2 = new MarketSpecialist(new SalaryInfo("card-4", 2000),"Market Specialist2 Name", "Market Specialist2 Surname", 27);

        System.out.println("fourth employee added:"+ tool.addEmployee(marketSpecialist1));
        marketSpecialist1.addReferenceNumber(4);
        System.out.println("fifth employee added:"+ tool.addEmployee(marketSpecialist2));
        marketSpecialist2.addReferenceNumber(5);
        //inchpes tpem arrays ays pahi drutyamb?

        //Ani jan toString() method-y verasahmanvac chi Accounter class-um dra hamar
        //Es hima da kanem, bayc vaxy aveli detail kasem sra masin
        System.out.println("Our Accounter(s) is(are):"+ Arrays.toString(tool.findByProfession(accounter.profession())));
        System.out.println("Accounter removed:"+ Arrays.toString(tool.removeEmployee(accounter)));


        //sranic nerqev der chem veranayel
        System.out.println("Employee with name Developer Name removed"+ Arrays.toString(tool.removeByName(" Developer Name")));

        tool.removeByNames("Developer Name","Account Name", "Ani");

        tool.removeWithSalaryRange(2000,22222222);

        tool.findByName("Account Name");

        tool.totalSalary();

    }
}
