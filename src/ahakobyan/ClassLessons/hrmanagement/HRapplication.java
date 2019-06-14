package ahakobyan.ClassLessons.hrmanagement;

import java.util.Arrays;

public class HRapplication {
    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("189756432", 500000);
        Developer employee = new Developer(salaryInfo, "Abul", "Hakobyan", 20);
        Developer employee1 = new Developer(salaryInfo, "Albert", "Hakobyan", 19);
        Developer employee2 = new Developer(salaryInfo, "Azat", "Hakobyna", 21);
        Developer employee3 = new Developer(salaryInfo, "Albert", "Hakobyan", 18);

        HRmanagement hrmanagement = new HRmanagement();

        hrmanagement.addEmployee(employee);
        hrmanagement.addEmployee(employee1);
        hrmanagement.addEmployee(employee2);
        hrmanagement.addEmployee(employee3);
        System.out.println(employee.profession());

        Profession profession = new Profession("Developer");
        Employee[] prof = hrmanagement.findByProfession(employee.profession());
        System.out.println(prof);

        String[] names = {"Albert", "Azat"};
        Employee[] removeByNames = hrmanagement.removeByNames(names);
        System.out.println(Arrays.toString(removeByNames));

        Employee[] removeByName = hrmanagement.removeByName("Abul");
        System.out.println(Arrays.toString(removeByName));

        Employee[] removeWithSalaryRange = hrmanagement.removeWithSalaryRange(150000, 650000);
        System.out.println(Arrays.toString(removeWithSalaryRange));

        Employee[] findEmployeeWithSalaryRange = hrmanagement.findEmployeeWithSalaryRange(450000, 550000);
        System.out.println(Arrays.toString(findEmployeeWithSalaryRange));

        Employee[] increaseSalary = hrmanagement.increaseSalary(employee1, 650000);
        System.out.println(Arrays.toString(increaseSalary));

        int totalSalary = hrmanagement.totalSalary();
        System.out.println(totalSalary);

        Employee findByCardNumber = hrmanagement.findByCardNumber("189756432");
        System.out.println(findByCardNumber);

        boolean contains = hrmanagement.contains(employee2);
        System.out.println(contains);
    }
}