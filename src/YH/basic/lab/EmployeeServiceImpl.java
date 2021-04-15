package YH.basic.lab;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    // 멤버변수 선언
    List<EmployeeVO> empdata = new ArrayList<>();
    EmployeeVO emp = null;


    // 단일 상수로 선언, 고정시킬려고 final,
    static  final String[] JOBID = {
            "FI_MGR", "AC_MGR ", "SA_MAN", "IT_PROG","ST_CLERK"};
    static int MINSAL = 2000;
    static int MAXSAL = 40000;
    static int MAXDEPT = 270;
    static int MAXMGRID = 206;




    //싱글톤 블럭 시작
        private static EmployeeServiceImpl empsrv = null;;
        private EmployeeServiceImpl(){
    }

    //이거는 싱글톤 아님 따로 EmployeeService getInstance 만든거임
    public static EmployeeService getInstance() {
            if(empsrv == null) empsrv = new EmployeeServiceImpl();
            return  empsrv;
    }
    //  화면에 프로그램 메뉴를 출력
    @Override
    public void displayMeu() {
        String displaymenu =
                        "--------------------- \n" +
                        "    사원관리 프로그램 v1 \n" +
                        "--------------------- \n" +
                        " 1. 사원정보 입력       \n" +
                        " 2. 사원정보 조회       \n" +
                        " 3. 사원정보 상세조회    \n" +
                        " 4. 사원정보 수정       \n" +
                        " 5. 사원정보 삭제       \n" +
                        " 0. 프로그램 종료        \n" +
                        "--------------------- \n" +
                        " 작업을 선택하세요 : ";
        System.out.print(displaymenu);
    }



    // 새로운 사원정보를 입력받음
    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("사번은?");
            String empno = sc.next();
            System.out.println("이름은은?");
            String fname = sc.next();
            System.out.println("성은?");
            String lname = sc.next();
            System.out.println("이메일은?");
            String email = sc.next();
            System.out.println("전화번호는?");
            String phone = sc.next();
            System.out.println("입사일은?");
            String hdate = sc.next();
                
            //사원정보 객체생성
            EmployeeVO emp = new EmployeeVO(
                    empno,fname,lname,email,phone,hdate);


            // 사원 추가정보를 생성해서 사원정보로 저장
            empsrv.makeExtInfo(emp);

            empdata.add(emp);
            
             }catch(Exception ex){

            System.out.println("잘못입력하셨습니다!!");
        }
    }




    // 사원 기본정보(사번, 이름, 성, 이메일, 전화번호, 입사일)등을
    // 리스트 형태로 출력함
    @Override
    public void showEmployee() { // 전체적으로 직원 입력값 그 중에 6개만 정했음
            String fmt = "%s %s %s %s %s %s \n";
            for(EmployeeVO emp:empdata){
                System.out.printf(fmt, emp.getEmpno(),
                        emp.getFname(), emp.getLname(),emp.getEmail()
                        ,emp.getPhone(), emp.getHdate());
            }
    }

    @Override
    public void showOneEmployee() {  //한명 한명 전체 싹다 불러온 입력값 그래서 11개s
        String fmt = "%s %s %s %s %s %s \n" +
                "%s %s %s %s %s \n"; //데이터 11개라서 $s는 11개
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 회원번호는?");
        String empno = sc.next(); //사번입력값
        //전체 이엠피 데이타중에서 e라는 변수에서 일부정보찾기

        EmployeeVO emp = null;
        for (EmployeeVO e : empdata) {
            // 찾는 데이터가 동적배열에 존재한다면
            // emp변수에 저장하고 반복문을 종료함

            // 전체데이터 안에서 Empno사번이 실제 empno와 같은지 판단
            if (e.getEmpno().equals(empno)) {
                emp = e;//e에할당
                break;

            }
            System.out.printf(fmt, emp.getEmpno(),emp.getFname(), emp.getLname()
                    ,emp.getEmail(),emp.getPhone(), emp.getHdate()
                    ,emp.getJobid(), emp.getSal(),emp.getComm()
                    ,emp.getMgrid(), emp.getDeptid() );


        }


    }
    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    @Override
    public void makeExtInfo(EmployeeVO emp) {
        Random rnd = new Random();
        //직업출력
        int key = rnd.nextInt(JOBID.length);
        String jobid = JOBID[key];
        //급여출력
        int sal = rnd.nextInt(MAXSAL) + MINSAL;
        int mgrid = rnd.nextInt(MAXMGRID) + 100;
        int deptid = (rnd.nextInt(MAXDEPT) % 100) * 10;


        DecimalFormat df = new DecimalFormat("#.##");
        double comm = Double.parseDouble(
                df.format( rnd.nextDouble() / 2 ));

        // System.out.println(jobid);
        //System.out.println(sal);
       // System.out.println(mgrid);
       // System.out.println(deptid);
       // System.out.println(comm);

        emp.setJobid(jobid);
        emp.setSal(sal);
        emp.setComm(comm);
        emp.setMgrid(mgrid + ""); //문자라서 이렇게""
        emp.setJobid(deptid + ""); //문자라서 이렇게 ""
    }

}