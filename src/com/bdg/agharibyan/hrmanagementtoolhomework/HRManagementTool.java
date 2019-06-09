package com.bdg.agharibyan.hrmanagementtoolhomework;

public class HRManagementTool {

    private Employee [] employees;
    private static final int DEFAULT_CONTAINER_SIZE = 10;

    public HRManagementTool(int initialSize){
        this.employees = new Employee[initialSize];
    }

    public HRManagementTool(){
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




    public void addEmployee(Employee employee){
        int lastemployeenumber = 0;
        for(lastemployeenumber = 0; lastemployeenumber < DEFAULT_CONTAINER_SIZE; lastemployeenumber ++){
            this.employees[lastemployeenumber] = employee;
            lastemployeenumber ++;
        }
 //       if(lastemployeenumber == DEFAULT_CONTAINER_SIZE){
 //           DEFAULT_CONTAINER_SIZE = DEFAULT_CONTAINER_SIZE *0,5;
 //       }
    }
}
