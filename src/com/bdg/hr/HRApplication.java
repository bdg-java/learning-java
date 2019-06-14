package com.bdg.hr;

import java.util.Arrays;

public class HRApplication {

    public static void main(String[] args) {

//        Shape shape = new Shape();
//
//        Triangle triangle = new Triangle();
//        System.out.println(shape.figureName());
//        System.out.println(triangle.figureName());
//
//        Shape[] shapes = new Shape[5];
//        shapes[0] = new Triangle();
//        shapes[1] = new Rectangle();
//
//        int total = 0;
//        for (Shape s : shapes) {
//            if (s != null) {
//                total = total + s.area();
//            }
//        }
//        System.out.println("Total area : " + total);

//        new HRManagementTool().findByProfession(new Profession("Developer"));
//        Developer developer = new Developer(new SalaryInfo("5181800000124589", 10), "John", "Smith", 10);
        Employee developer1 = new Developer(new SalaryInfo("5181800000124589", 100), "John", "Smith", 20);
        Employee developer2 = new Developer(new SalaryInfo("5181800000124588", 200), "Jack", "Black", 21);
        Employee manager1 = new Manager(new SalaryInfo("5181800000124587", 200), "Ann", "Black", 21);
        Employee marketspec1 = new MarketingSpecialist(new SalaryInfo("5181800000124585", 50), "Mary", "White", 20);
        Employee acc1 = new Accountant(new SalaryInfo("5181800000124581", 150), "Jane", "White", 30);

        HRManagementTool button = new HRManagementTool();
        System.out.println(button.addEmployee(developer1));
        System.out.println(button.addEmployee(developer2));
        System.out.println(button.addEmployee(manager1));
        System.out.println(button.addEmployee(marketspec1));
        System.out.println(button.addEmployee(acc1));
        System.out.println(button.totalSalary());
//        System.out.println(Arrays.toString(button.findByProfession(manager1.profession())));
//        System.out.println(Arrays.toString(button.removeByName2("Jane")));
        System.out.println(Arrays.toString(button.removeByName("Jane")));
        System.out.println(Arrays.toString(button.findByName("Ann")));

    }
}
