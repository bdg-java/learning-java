package com.bdg.hr;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("ARAKS SHAHBAZYAN", 1234000);
        Developer developerEmployee = new Developer(salaryInfo, "Bob", "John", 23);
        Developer developerEmployee1 = new Developer(salaryInfo, "dev1", "Sh", 54);
        Acounter acounterEmployee = new Acounter(salaryInfo, "eeeeeee", "Acounter employee", 54);

        HRManagementTool hrManagementTool = new HRManagementTool();
        hrManagementTool.addEmployee(developerEmployee);
        hrManagementTool.addEmployee(developerEmployee1);
        hrManagementTool.addEmployee(acounterEmployee);

        Employee findByProfession[] = hrManagementTool.findByProfession(developerEmployee.profession());
       // System.out.println(Arrays.toString(findByProfession));


//              --------  REMOVE BY NAMES----------------
        String[] names = {"Bob", "bbb"};
        Employee[] removeByNames = hrManagementTool.removeByNames(names);
        System.out.println(Arrays.toString(removeByNames));

        //              --------  REMOVE BY NAME-----------
       // Employee[] removeByName = hrManagementTool.removeByName("Araks");
     //   System.out.println(Arrays.toString(removeByName));


        //                --------  REMOVE BY SALARY RANGE-----------
        Employee[] removeByRange = hrManagementTool.removeWithSalaryRange(10000, 20000);
      //  System.out.println(Arrays.toString(removeByRange));
        Employee findByName[] = hrManagementTool.findByName("Araks");
     //   System.out.println(Arrays.toString(findByName));


    }
}