package ahakobyan.classLessons.hrmanagement;

public class HRapplication {
    public static void main(String[] args) {

        SalaryInfo salaryInfo = new SalaryInfo("189756432", 500000);
        Developer developer = new Developer(salaryInfo, "Abul", "Hakobyan", 20);

        HRmanagement hrmanagement = new HRmanagement();
        hrmanagement.addEmployee(developer);

        SalaryInfo salaryInfo1 = new SalaryInfo("189756432", 300000);
        Developer developer1 = new Developer(salaryInfo, "Albert", "Hakobyan", 19);
        hrmanagement.addEmployee(developer1);

        SalaryInfo salaryInfo2 = new SalaryInfo("189756432", 400000);
        Developer developer2 = new Developer(salaryInfo, "Azat", "Hakobyna", 21);
        hrmanagement.addEmployee(developer2);

        SalaryInfo salaryInfo3 = new SalaryInfo("189756432", 250000);
        Developer developer3= new Developer(salaryInfo, "Albert", "Hakobyan", 18);
        hrmanagement.addEmployee(developer3);


//        Profession profession = new Profession("Developer");
//        Employee[] prof = hrmanagement.findByProfession(employee.profession());
//        System.out.println(prof);
//
//        String[] names = {"Albert", "Azat"};
//        Employee[] removeByNames = hrmanagement.removeByNames(names);
//        System.out.println(Arrays.toString(removeByNames));
//
//        Employee[] removeByName = hrmanagement.removeByName("Abul");
//        System.out.println(Arrays.toString(removeByName));
//
//        Employee[] removeWithSalaryRange = hrmanagement.removeWithSalaryRange(150000, 650000);
//        System.out.println(Arrays.toString(removeWithSalaryRange));
//
//        Employee[] findEmployeeWithSalaryRange = hrmanagement.findEmployeeWithSalaryRange(450000, 550000);
//        System.out.println(Arrays.toString(findEmployeeWithSalaryRange));
//
//        Employee[] increaseSalary = hrmanagement.increaseSalary(employee1, 650000);
//        System.out.println(Arrays.toString(increaseSalary));
//
//        int totalSalary = hrmanagement.totalSalary();
//        System.out.println(totalSalary);
//
//        Employee findByCardNumber = hrmanagement.findByCardNumber("189756432");
//        System.out.println(findByCardNumber);
//
//        boolean contains = hrmanagement.contains(employee2);
//        System.out.println(contains);

        System.out.println(hrmanagement.totalSalary());
        System.out.println(hrmanagement.increaseSalary(developer, 550000));
        System.out.println(hrmanagement.findEmployeeWithSalaryRange(200000, 600000));
        System.out.println(hrmanagement.findByCardNumber("189756432"));
        System.out.println(hrmanagement.removeByName("Azat"));
        System.out.println(hrmanagement.removeWithSalaryRange(400000, 600000));
        System.out.println(hrmanagement.removeByNames("Abul","Albert"));
    }
}