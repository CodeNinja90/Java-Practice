import java.io.*;

public class EmployeeTest {


    public static void main(String args[]){

        Employee empobj = new Employee();
        empobj.setName("Naresh");
        empobj.setDesignation("CEO");
        empobj.setAge(34);
       /* empobj.setSalary(20000.00);*/

        empobj.printEmployeeInfo();

    }
}
