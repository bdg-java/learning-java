package com.bdg.agharibyan.hrmanagementtoolhomework;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

        Developer developer = new Developer(new SalaryInfo("developer's Card", 300000), "Developer's Name", "Developer's Surname", 30);
        Accounter accounter = new Accounter(new SalaryInfo("accounter's Card", 250000), "Accounter's Name", "Accounter's Surname", 35);
        HRSpecialist hrSpecialist = new HRSpecialist(new SalaryInfo("hrspecialist's card", 200000), "HRSpecialist's Name", "HRSpecialist's Surname", 25);
        MarketSpecialist marketSpecialist = new MarketSpecialist(new SalaryInfo("marketspecialist's card", 280000), "MarketSpecialist's Name", "MarketSpecialist's Surname", 28);
        HRManagementTool myTool = new HRManagementTool(3);

        System.out.println("Add developer: "+ myTool.addEmployee(developer));
        System.out.println("Add accounter: "+ myTool.addEmployee(accounter));
        System.out.println("Add hrSpecialist: "+ myTool.addEmployee(hrSpecialist));
        System.out.println("Add marketSpecialist: "+ myTool.addEmployee(marketSpecialist));
        System.out.println("Add null: "+ myTool.addEmployee(null));
        System.out.println("..................................................................................................");
        myTool.currentStaff();
        System.out.println("Developer contains: "+ myTool.contains(developer));
        System.out.println("TotalSalary: "+ myTool.totalSalary());
        System.out.println("Increase Salary for developer: "+ myTool.increaseSalary(developer, 400000));
        System.out.println("TotalSalary after increase salary: "+ myTool.totalSalary());
        System.out.println("..................................................................................................");
        System.out.println("Find by profession hrSpecialist: "+ Arrays.toString(myTool.findByProfession(hrSpecialist.profession())));
        System.out.println("Find by cardNumber hrspecialist's card: "+ Arrays.toString(myTool.findByCardNumber("hrspecialist's card")));
        System.out.println("remove Developer:"+ (myTool.removeEmployee(developer)));
        myTool.currentStaff();
        System.out.println("Find by name MarketSpecialist's Name: "+ Arrays.toString(myTool.findByName("MarketSpecialist's Name")));
        System.out.println("remove employee with name HRSpecialist's Name: "+ Arrays.toString(myTool.removeByName("HRSpecialist's Name")));
        myTool.currentStaff();
        System.out.println("remove employee with name Ani, MarketSpecialist's Name: "+ Arrays.toString(myTool.removeByNames("Ani", "MarketSpecialist's Name")));
        myTool.currentStaff();
        System.out.println("Find with Salary Range (0,1000000): "+ Arrays.toString(myTool.findEmployeeWithSalaryRange(0,1000000)));
        System.out.println("remove with Salary Range (0,1000000): "+ Arrays.toString(myTool.removeWithSalaryRange(0,1000000)));
        myTool.currentStaff();

        //inchpes add areci employeeneris, aynpes el bolorin remove :)

    }
}