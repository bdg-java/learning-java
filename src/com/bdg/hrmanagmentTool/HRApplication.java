package com.bdg.hrmanagmentTool;


import java.util.Arrays;

public class HRApplication {
    public static void main(String[] args) {

        HRManagementTool tool = new HRManagementTool(6);
        Developer dev1 = new Developer(new SalaryInfo("123451", 200), "Ani", "Manukyan", 30);
        Developer dev2 = new Developer(new SalaryInfo("123452", 250), "Anna", "Makonyan", 30);
        Accounter acc3 = new Accounter(new SalaryInfo("123453", 300), "Armen", "Petrosyan", 30);
        Accounter acc4 = new Accounter(new SalaryInfo("123454", 350), "Armen", "Hovhannisyan", 30);
        Accounter acc5 = new Accounter(new SalaryInfo("123455", 400), "Poxos", "Poxosyan", 30);
        Developer dev6 = new Developer(new SalaryInfo("123456",450), "Petros", "Petrosyan",  30);
        /***************************************************************************/
        System.out.println(tool.addEmployee(dev1));
        System.out.println(tool.addEmployee(dev2));
        System.out.println(tool.addEmployee(acc3));
        System.out.println(tool.addEmployee(acc4));
        System.out.println(tool.addEmployee(acc5));
        System.out.println(tool.addEmployee(dev6));

        tool.addEmployee(dev1);
        tool.addEmployee(dev2);
        tool.addEmployee(acc3);
        tool.addEmployee(acc4);
        tool.addEmployee(acc5);
        tool.addEmployee(dev6);


/****************************************************************************************/
//        tool.removeByName(dev1.name);
//        System.out.println("remove Emmployee : " + tool.removeEmployee(dev1));
//        tool.removeByName("Ani");
////        System.out.println("remov Emmployee by names"+ Arrays.toString(tool.removeByNames("Armen" , "Armen")));
////        System.out.println(tool.removeByNames("Armen", "Armen"));

        System.out.println(tool.removeWithSalaryRange(200, 450));


//
//        tool.addEmployee(dev1);
//        tool.addEmployee(dev2);
//        tool.addEmployee(acc3);
//        tool.addEmployee(acc4);
//        tool.addEmployee(acc5);
//        tool.addEmployee(dev6);
//
//        System.out.println(tool.contains(dev1));
//        System.out.println(tool.contains(dev2));
//        System.out.println(Arrays.toString(tool.findByName("Anna")));
//        System.out.println(tool.findByCardNumber("123456"));
//        System.out.println(Arrays.toString(tool.findEmployeeWithSalaryRange(200000,300000)));
//        System.out.println(tool.increaseSalary(dev1, 600000));
//        System.out.println(tool.totalSalary());




    }
}
