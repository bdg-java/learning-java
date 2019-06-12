package com.bdg.hr;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("ARAKS SHAHBAZYAN",1234000);
        Developer employee = new Developer(salaryInfo,"Araks","Sh",23);
        Developer employee1 = new Developer(salaryInfo,"fesf","Sh",54);
        Developer employee3 = new Developer(salaryInfo,"fesf","Sh",54);

        HRManagementTool hrManagementTool = new HRManagementTool();
        hrManagementTool.addEmployee(employee);
        hrManagementTool.addEmployee(employee1);

     //   System.out.println(employee.profession());
       // Profession profession = new Profession("Developer");
//       Employee prof[] =  hrManagementTool.findByProfession(employee.profession());
//       boolean remove =  hrManagementTool.removeEmployee(employee3);
//        System.out.println(remove);


//              --------  REMOVE BY NAMES----------------
//        String[] names = {"Araks","bbb"};
//        Employee[] removeByName = hrManagementTool.removeByNames(names);
//        System.out.println(Arrays.toString(removeByName));

//                --------  REMOVE BY NAME-----------
//        Employee removeByName[] = hrManagementTool.removeByName("Araks");
//        System.out.println(Arrays.toString(removeByName));


        //                --------  REMOVE BY SALARY RANGE-----------
//      Employee removeByRange[] = hrManagementTool.removeWithSalaryRange(10000,20000);
//        System.out.println(Arrays.toString(removeByRange));
        Employee removeByRange[] = hrManagementTool.findByName("Araks");
        System.out.println(Arrays.toString(removeByRange));


    }
}
