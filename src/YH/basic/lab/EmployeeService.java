package YH.basic.lab;

public interface EmployeeService {

    // EmployeeService인터페이스 만든거고, EmployeeV1Main에 있던걸 아래써놓은 것을 구현한것이다.
    //displayMeu,newEmployee,showEmployee,showOneEmployee,modifyEmployee, removeEmployee

    void displayMeu();


    void newEmployee();

    void showEmployee();

    void showOneEmployee();

    void modifyEmployee();

    void removeEmployee();

    void makeExtInfo(EmployeeVO emp);
}
