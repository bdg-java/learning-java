package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRManagementTool {

    private Employee[] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;

    private int currentEmployeeCount;

    public HRManagementTool(int initialSize) {
        this.employees = new Employee[initialSize];
        this.currentEmployeeCount = 0;
    }

    public HRManagementTool() {
        this(DEFAULT_CONTAINER_SIZE);
    }

//    public boolean addEmployee(Employee employee){
//        if(employee != null){
//            return true;
//        }
//        return false;
//    }
//
//    sa e petq,bayc ankap a shat :), te booleany pokhem, vor addEmployee methods indz aravel shat functional ta?
//      ughghaki chgitem inch em grelu u vonc :(
//      grelu em, vor ete nakhord ashkhatakcov lracel e initialSize kam DEFAULT_CONTAINER_SIZE,
//      apa metsacnum em inchpes asum eiq voroshaki tokosov
//      u return anem arden stacvats Size? Ha? Add employee methody mez v itogi inch a talis menak qanaki 1ov avelacum?


//    public void addEmployee(Employee employee) {
//        int lastemployeenumber = 0;
//        for (lastemployeenumber = 0; lastemployeenumber < DEFAULT_CONTAINER_SIZE; lastemployeenumber++) {
//            this.employees[lastemployeenumber] = employee;
//            lastemployeenumber++;
//        }
//        //       if(lastemployeenumber == DEFAULT_CONTAINER_SIZE){
//        //           DEFAULT_CONTAINER_SIZE = DEFAULT_CONTAINER_SIZE *0,5;
//        //       }
//    }

    public boolean addEmployee(Employee employee) {
        if (this.currentEmployeeCount == this.employees.length) {
            this.resize();
        }
        this.employees[this.currentEmployeeCount] = employee;
        this.currentEmployeeCount++;
        return true;
    }

    private void resize() {
        Employee[] resizedEmployee = new Employee[this.employees.length + this.employees.length / 2]; //mecacnum enq 0.5 angam
        int k = 0;
        for (Employee employee : this.employees) {
            resizedEmployee[k] = employee;
            k++;
        }
        this.employees = resizedEmployee;
    }

}
