package com.bdg.hrmanagmentTool;


import java.util.Arrays;

public class HRApplication {
    public static void main(String[] args) {
        System.out.println(HRManagementTool.DEFAULT_CONTAINER_SIZE);

        Developer dev1 = new Developer(new SalaryInfo("123451", 100), "Ani", "Manukyan", 30);
        Developer dev2 = new Developer(new SalaryInfo("123452", 250), "Ani", "Makonyan", 30);
        Accounter acc3 = new Accounter(new SalaryInfo("123453", 300), "Armen", "Petrosyan", 30);
        Accounter acc4 = new Accounter(new SalaryInfo("123454", 350), "Armen", "Hovhannisyan", 30);
        Accounter acc5 = new Accounter(new SalaryInfo("123455", 400), "Poxos", "Poxosyan", 30);
        Developer dev6 = new Developer(new SalaryInfo("123456", 450), "Petros", "Petrosyan", 30);

        HRManagementTool tool = new HRManagementTool(6);
        System.out.println (tool.addEmployee(dev1));
        System.out.println(tool.addEmployee(dev2));
        System.out.println(tool.addEmployee(dev6));
//        System.out.println(tool.currentIndex);

        System.out.println (tool.addEmployee(acc3));
        System.out.println(tool.addEmployee(acc4));
        System.out.println(tool.addEmployee(acc5));
        System.out.println(tool.currentIndex);
        System.out.println (tool.removeEmployee(dev1));
        System.out.println(tool.removeEmployee(dev2));
        System.out.println(tool.removeEmployee(dev6));
        System.out.println(tool.currentIndex);
        System.out.println (tool.addEmployee(dev1));
        System.out.println(tool.addEmployee(dev2));
        System.out.println(tool.addEmployee(dev6));
        System.out.println(tool.currentIndex);


        System.out.println("Find By Profession : ");

        System.out.println("DEVELOPERS :" + " " + Arrays.toString(tool.findByProfession(new Profession("Developer"))));
        System.out.println("ACCOUNTERS :" + " " + Arrays.toString(tool.findByProfession(new Profession("Accounter"))));
        System.out.println("HRSPETIALIST :" + " " +Arrays.toString(tool.findByProfession(new Profession("HRSpecialist"))));

        System.out.println("Find By Name : ");
        int length = tool.findByName("Ani").length;
        System.out.println("The number of this name :" + " " +length);
        System.out.println(Arrays.toString(tool.findByName("Ani")));
        System.out.println(tool.currentIndex);

        System.out.println("Find by Salary Range : ");
        int len = tool.findBySalaryRange(200,300).length;
        System.out.println("The number of this salary :" + " " +len);
        System.out.println(Arrays.toString(tool.findBySalaryRange(200,300)));
        System.out.println(tool.currentIndex);


        System.out.println("Find by Card Number : " + " " + tool.findByCardNumber("123451"));

        System.out.println(tool.contains(dev1));


        System.out.println(tool.increaseSalary(dev1, 100));

        System.out.println("We have already found the Name and removed it that is why we have : " + Arrays.toString(tool.removeByName("Poxos")));
        System.out.println(tool.currentIndex);


        int leng = tool.removeWithSalaryRange(300,300).length;
        System.out.println("The number of this salary :" + " " +leng);
        System.out.println(Arrays.toString(tool.removeWithSalaryRange(300,300)));
        System.out.println("Total Salary is " + " " + tool.totalSalary());

        System.out.println(tool.currentIndex);



    }
}
