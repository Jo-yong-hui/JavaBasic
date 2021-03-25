package YH.basic.day08.hr;

public class Job_History {

    private String employee_id;
    private String start_date;
    private String end_data;
    private int job_id;
    private int deparment_id;


    public Job_History(String employee_id, String start_date, String end_data,
                       int job_id, int deparment_id) {
        this.employee_id = employee_id;
        this.start_date = start_date;
        this.end_data = end_data;
        this.job_id = job_id;
        this.deparment_id = deparment_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_data() {
        return end_data;
    }

    public void setEnd_data(String end_data) {
        this.end_data = end_data;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getDeparment_id() {
        return deparment_id;
    }

    public void setDeparment_id(int deparment_id) {
        this.deparment_id = deparment_id;
    }

    public Job_History(){




    }



}
