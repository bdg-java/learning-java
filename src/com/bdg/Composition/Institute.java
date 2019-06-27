package com.bdg.Composition;

import java.util.List;

public class Institute {

    String InstituteName;
    private List<Department> departmentList;

    Institute(String InstituteName, List<Department> departmentList ){
        this.InstituteName = InstituteName;
        this.departmentList = departmentList;
    }

    public int getTotalStudensInstitute(){

        int noofStudents = 0;
        List<Student> students;

        for(Department dept: departmentList){
            students = dept.getStudents();
            for(Student s : students){
                noofStudents++;
            }
        }
        return noofStudents;

    }

}
