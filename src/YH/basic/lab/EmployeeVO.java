package YH.basic.lab;

public class EmployeeVO {
//VO값을저장 //V1main 값실행
    protected String empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String mgrid;
    protected String deptid;

    //기본생성자 만들고 생성자 만들기 눌러서 안에있는거 선택해서 확인
    public EmployeeVO(String empno, String fname, String lname,
                      String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }
        //기본생성자 선택안함으로 한것
    public EmployeeVO() {

    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        String fmt = "emp{empno:%s,fname:%s,lname:%s" + // 숫자%s 문자%d
                "email:%s,phone:%s,hdate:%s\n" +
                "jobid:%s, sal:%s, comm:%s" +
                "mgrid:%s,deptid:%s}";
        String result = String.format(fmt,empno,fname,lname,email,phone,
                                        hdate,jobid,sal,comm,mgrid,deptid);

        return result;
    }
}


