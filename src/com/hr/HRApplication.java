package com.hr;

public class HRApplication {

    public static void main(String[] args) {

        HRManagementTool HRTool = new HRManagementTool();

        Employee employee = new Developer(new SalaryInfo("123456", 1000), "Eduard", "Poghosyan", 25);
        Employee employee1 = new Developer(new SalaryInfo("123456", 1000), "Eduard1", "Poghosyan", 25);
        Employee employee2 = new Developer(new SalaryInfo("123456", 1000), "Eduard2", "Poghosyan", 25);
        Employee employee3 = new Developer(new SalaryInfo("123456", 1000), "Eduard3", "Poghosyan", 25);
        Employee employee4 = new Developer(new SalaryInfo("123456", 1000), "Eduard4", "Poghosyan", 25);
        Employee employee5 = new Developer(new SalaryInfo("123456", 1000), "Eduard5", "Poghosyan", 25);
        Employee employee6 = new Developer(new SalaryInfo("123456", 1000), "Eduard6", "Poghosyan", 25);
        Employee employee7 = new Developer(new SalaryInfo("123456", 1000), "Eduard7", "Poghosyan", 25);

        HRTool.addEmployee(employee);
        HRTool.addEmployee(employee1);
        HRTool.addEmployee(employee2);
        HRTool.addEmployee(employee3);
        HRTool.addEmployee(employee4);
        HRTool.removeEmployee(employee);
        HRTool.removeEmployee(employee4);
        HRTool.removeEmployee(employee3);
//        System.out.println("length" + HRTool.getFreePositionsIds().length);
//        HRTool.removeEmployee(employee2);
//        System.out.println("length" + HRTool.getFreePositionsIds().length);
//        HRTool.removeEmployee(employee1);
        HRTool.addEmployee(employee5);
        HRTool.addEmployee(employee6);
        HRTool.removeEmployee(employee6);
        HRTool.addEmployee(employee7);
//        HRTool.addEmployee(employee7);



        for (int i = 0; i < HRTool.getEmployees().length; i++) {
//            if (HRTool.getEmployees()[i] != null) {
//                System.out.println(HRTool.getEmployees()[i].name);
                System.out.println(HRTool.getEmployees()[i]);
//                System.out.println(HRTool.getEmployees()[i].referenceNumber);

//            }
        }
//
//        for (int i = 0; i < HRTool.getFreePositionsIds().length; i++) {
//            System.out.println(HRTool.getFreePositionsIds()[i]);
//            System.out.println("length" + HRTool.getFreePositionsIds().length);
//        }
//

//        for (int x: HRTool.getFreePositionsIds()) {
//            System.out.println(x);
//        }
    }
}
