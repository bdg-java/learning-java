package com.lesson10;

public class HrManagementToolApplication {
    public static void main(String[] args) {
        HRManagementTool hr1 = new HRManagementTool();


        Developer dev1 = new Developer(new SalaryInfo("121212", 200000), "Ani", "Vardanyan", 25);
        Developer dev2 = new Developer(new SalaryInfo("121213", 220000), "Narine", "Sargsyan", 26);
        Developer dev3 = new Developer(new SalaryInfo("121214", 500000), "Levon", "Shahnazaryan", 32);
        Developer dev4 = new Developer(new SalaryInfo("121215", 300000), "Irina", "Shahnazaryan", 32);
        Accounter dev5 = new Accounter(new SalaryInfo("121216", 300000), "Hasmik", "Petrosyan", 32);
//-------------------------------------addEmployee-------------------------------------------------
        hr1.addEmployee(dev1);
        hr1.addEmployee(dev2);
        hr1.addEmployee(dev3);
        hr1.addEmployee(dev4);
        hr1.addEmployee(dev5);

        for (int i = 0; i < hr1.getEmployees().length; i++) {
            if (hr1.getEmployees()[i] != null)
                System.out.println(hr1.getEmployees()[i]);
        }

        // -------------------------------removeEmployee-----------------------------------------------
        System.out.println(".............. removeEmployee..........................");
        System.out.println(hr1.removeEmployee(dev2));
        for (int i = 0; i < hr1.getEmployees().length; i++) {
            if (hr1.getEmployees()[i] != null)
                System.out.println(hr1.getEmployees()[i]);
        }
//--------------------------- findbyName-------------------------------------------

        System.out.println(".............. findbyName..........................");
        int length = hr1.findByName("Ani").length;
        System.out.println(length);
        Employee[] listemployee = new Employee[length];
        listemployee = hr1.findByName("Ani");
        for (int i = 0; i < listemployee.length; i++) {
            if (listemployee[i] != null)
                System.out.println(listemployee[i]);
        }
//------------------------findbyCard-----------------------------------------------
        System.out.println(".............. findbyCard..........................");
        System.out.println(hr1.findByCardNumber("121214"));

// -------------------------------findwithSalaryrange-----------------------------------------------
        System.out.println(".............. findwithSalaryrange..........................");
        length = hr1.findEmployeeWithSalaryRange(50000, 250000).length;
        listemployee = new Employee[length];
        listemployee = hr1.findEmployeeWithSalaryRange(50000, 250000);
        for (int i = 0; i < listemployee.length; i++)
            if (listemployee[i] != null)
                System.out.println(listemployee[i]);


        // -------------------------------contains-----------------------------------------------
        System.out.println(".............. contains..........................");
        System.out.println(hr1.contains(dev1));
        System.out.println(dev4);
        System.out.println(hr1.contains(dev4));

        // -------------------------------increasesalary-----------------------------------------------
        System.out.println(".............. increasesalary..........................");
        System.out.println(hr1.increaseSalary(dev4, 10));
        // -------------------------------increasesalary-----------------------------------------------
        System.out.println(".............. increasesalary..........................");
        System.out.println(hr1.increaseSalary(dev3, 15));
        // -------------------------------totalSalary-----------------------------------------------
        System.out.println(".............. totalSalary..........................");
        System.out.println(hr1.totalSalary());
        // -------------------------------removeWithSalaryRange-----------------------------------------------
        System.out.println(".............. removeWithSalaryRange..........................");
        System.out.println(hr1.removeWithSalaryRange(600000, 700000));
        for (int i = 0; i < hr1.getEmployees().length; i++) {
            if (hr1.getEmployees()[i] != null)
                System.out.println(hr1.getEmployees()[i]);
        }
        // -------------------------------removeByName-----------------------------------------------
        System.out.println(".............. removeBynames..........................");
        System.out.println(hr1.removeByNames("Levon,Ani"));
        for (int i = 0; i < hr1.getEmployees().length; i++) {
            if (hr1.getEmployees()[i] != null)
                System.out.println(hr1.getEmployees()[i]);
        }


        // -------------------------------findByprofession------------------------------------------
        Employee[] emp = hr1.findByProfession(new Profession("Accounter"));
        System.out.println(".............. findByprofession..........................");
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null)
                System.out.println(emp[i]);
        }


    }

}
