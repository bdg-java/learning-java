package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRApplication {

    public static void main(String[] args) {

//        Employee employee = new Employee("123456789","Poghos", "Poghosyan", 30) {
//            @Override
//            public Profession profession() {
//                return null;
//            }
//        };
//
//        new HRManagementTool() ;


        // SalaryInfoyi salaryn inchpes grem, ete anun e uzum anmijapes Stringic heto, u Numberi Stringy karogh er int linel?


        Developer developer = new Developer(new SalaryInfo("card 1", 300000), "Developer Name", "Developer Surname", 20);
        Accounter accounter = new Accounter(new SalaryInfo("card-2", 3333), "Account Name", "Account Surname", 30);
        HRSpecialist specialist = new HRSpecialist(new SalaryInfo("card-3", 342), "Hr Specialist Name", "Hr Specialist Surname", 32);


        HRManagementTool tool = new HRManagementTool(3);

        tool.addEmployee(developer);
        tool.addEmployee(accounter);
        tool.addEmployee(specialist);

    }
}
