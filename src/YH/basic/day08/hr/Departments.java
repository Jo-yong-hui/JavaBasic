package YH.basic.day08.hr;

public class Departments {

    private int departmenet_id;
    private String department_name;
    private int manager_id;
    private int location_id;


    public Departments(int departmenet_id, String department_name,
                       int manager_id, int location_id) {
        this.departmenet_id = departmenet_id;
        this.department_name = department_name;
        this.manager_id = manager_id;
        this.location_id = location_id;
    }

    public int getDepartmenet_id() {
        return departmenet_id;
    }

    public void setDepartmenet_id(int departmenet_id) {
        this.departmenet_id = departmenet_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}

