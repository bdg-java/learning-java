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
        MarketSpecialist marketSpecialist2 = new MarketSpecialist(new SalaryInfo("card-5", 2000),"Market Specialist2 Name", "Market Specialist2 Surname", 27);

        System.out.println("fourth employee added:"+ tool.addEmployee(marketSpecialist1));
        marketSpecialist1.addReferenceNumber(4);
        System.out.println("fifth employee added:"+ tool.addEmployee(marketSpecialist2));
        marketSpecialist2.addReferenceNumber(5);

        System.out.println("Our Accounter(s) is(are):"+ Arrays.toString(tool.findByProfession(accounter.profession())));
        System.out.println("Accounter removed:"+ Arrays.toString(tool.removeEmployee(accounter)));

        System.out.println("Employee with name Developer Name removed:"+ Arrays.toString(tool.removeByName("Developer Name")));
        System.out.println("Employees with names XXX, Market Specialist2 Name, YYY removed:"+ Arrays.toString(tool.removeByNames("XXX","Market Specialist2 Name", "YYY")));

//        System.out.println("Employee with salary range removed:"+ Arrays.toString(tool.removeWithSalaryRange(20,999)));
        System.out.println("first employee = developer Contains:"+ tool.contains(developer));
        System.out.println("second employee = accounter Contains:"+ tool.contains(accounter));
        System.out.println("third employee = hrspecialist Contains:"+ tool.contains(hrspecialist));
        System.out.println("fourth employee = marketSpecialist1 Contains:"+ tool.contains(marketSpecialist1));
        System.out.println("fifth employee = marketSpecialist2 Contains:"+ tool.contains(marketSpecialist2));

        System.out.println("first employee added again:"+ tool.addEmployee(developer));
        System.out.println("second employee added again:"+ tool.addEmployee(accounter));
        System.out.println("fifth employee added again:"+ tool.addEmployee(marketSpecialist2));

        System.out.println("find employee(s) with name Accounter Name:"+ Arrays.toString(tool.findByName("Accounter Name")));
        System.out.println("find employee with card Number 'card-5':"+ tool.findByCardNumber("card-5"));
        System.out.println("find employee(s) with salary range '20,999':"+ Arrays.toString(tool.findEmployeeWithSalaryRange(20,999)));
        System.out.println("increaseSalaryForDeveloper:"+ tool.increaseSalary(developer, 600000));
        System.out.println("totalSalary:"+ tool.totalSalary());

    }
}
