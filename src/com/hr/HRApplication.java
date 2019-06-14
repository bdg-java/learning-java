package com.hr;

public class HRApplication {

    public static void main(String[] args) {

        HRManagementTool HRTool = new HRManagementTool();

        Employee employee = new Developer(new SalaryInfo("123456", 1000), "Eduard", "Poghosyan", 25);
        Employee employee1 = new Developer(new SalaryInfo("123456", 1000), "Eduard1", "Poghosyan", 25);
        Employee employee2 = new Developer(new SalaryInfo("123456", 1000), "Eduard2", "Poghosyan", 25);
        Employee employee3 = new Developer(new SalaryInfo("123456", 1000), "Eduard3", "Poghosyan", 25);
        Employee employee4 = new Developer(new SalaryInfo("123456", 1000), "Eduard4", "Poghosyan", 25);

        HRTool.addEmployee(employee);
        HRTool.addEmployee(employee1);
        HRTool.removeEmployee(employee);
        HRTool.addEmployee(employee2);
        HRTool.addEmployee(employee3);
        HRTool.addEmployee(employee4);
//        HRTool.removeEmployee(employee4);
//        HRTool.removeEmployee(employee3);
//        HRTool.removeEmployee(employee2);
//        HRTool.removeEmployee(employee1);


        for (Employee arr: HRTool.getEmployees()) {
            System.out.println(arr.name);
        }

        for (int x: HRTool.getFreePositionsIds()) {
            System.out.println(x);
        }
    }
}
