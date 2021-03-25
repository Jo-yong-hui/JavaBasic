package YH.basic.day08.hr;

 public class Employees {
     private String employees_id;
     private String first_name;
     private String last_name;
     private String email;
     private int phone_number;
     private int hire_date;
     private int job_id;
     private int salary;
     private double commission_pct;
     private String manager_id;
     private int department_id;

    public Employees(String employee_id, String first_name, String last_name,
                     String email, int phone_number, int hire_date, int job_id, int salary, double commission_pct, String manager_id, int department_id) {
         this.employees_id = employee_id;
         this.first_name = first_name;
         this.last_name = last_name;
         this.email = email;
         this.phone_number = phone_number;
         this.hire_date = hire_date;
         this.job_id = job_id;
         this.salary = salary;
         this.commission_pct = commission_pct;
         this.manager_id = manager_id;
         this.department_id = department_id;
     }

     public String getEmployee_id() {
         return employees_id;
     }

     public void setEmployee_id(String employees_id) {
         this.employees_id = employees_id;
     }

     public String getFirst_name() {
         return first_name;
     }

     public void setFirst_name(String first_name) {
         this.first_name = first_name;
     }

     public String getLast_name() {
         return last_name;
     }

     public void setLast_name(String last_name) {
         this.last_name = last_name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public int getPhone_number() {
         return phone_number;
     }

     public void setPhone_number(int phone_number) {
         this.phone_number = phone_number;
     }

     public int getHire_date() {
         return hire_date;
     }

     public void setHire_date(int hire_date) {
         this.hire_date = hire_date;
     }

     public int getJob_id() {
         return job_id;
     }

     public void setJob_id(int job_id) {
         this.job_id = job_id;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public double getCommission_pct() {
         return commission_pct;
     }

     public void setCommission_pct(double commission_pct) {
         this.commission_pct = commission_pct;
     }

     public String getManager_id() {
         return manager_id;
     }

     public void setManager_id(String manager_id) {
         this.manager_id = manager_id;
     }

     public  int getDepartment_id() {
         return department_id;
     }

     public void setDepartment_id( int department_id) {
         this.department_id = department_id;
     }
 }






