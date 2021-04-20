package YH.basic.day16;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJDBC {
    public static void main(String[] args) {
        // JDBC
        // java database connectivity
        // 자바 프로그래밍언어를 통해 다양한 관계형 데이터베이스에
        // 접속하고, SQL문을 실행하고 관리하고자 할때 사용하는
        // 표준 SQL 인터페이스
        // 이것을 통해 데이터베이스 코드를 한번만
        // 작성해두면 어떤 DBMS라도 코드 변경없이
        // 동일하게 작동할 수 있음

        //JDK에 포함된 JDBC인터페이스는 java.sql 패키지 아래에 있음
        // 하지만, 이것만으로는 작동하지 않고
        // 각 데이터베이스 제조사가 JDBC인터페이스를 구현해서
        // 작성한 클래스가 필요한데, 이것을 JDBC 드라이버 매니저라 함
        // JDBC 드라이버 매니저는 데이터베이즈 제조사 홈페이지에서
        // 내려받을수 있음

        //amazon 데이터베이스 접속 확인
        String drv = "org.mariadb.jdbc.Driver";
        String amz = "";
        String url = "jdbc:mariadb://"+amz+":3306/bigdata";
        String usr = "admin";
        String pwd = "bigdata2020";

        //oracle용 drv, url
        String drv1 = "Oracle.jdbc.OracleDriver";
        String url1 = "jdbc:oracle:thin:@192.168.147.128:1521:XE"; //url 템플릿을 복사해서 쓰면됨

        //postgresql용 drv, url
        String drv2 = "org.postgresql.Driver"; //class name
        String url2 = "jdbc:postgresql://192.168.147.128:5432/postegres";
        //url 템플릿 [database]안에 postegre 넣은것




        // 1.JDBC 드라이버를 메모리에 초기화함
        try{
            Class.forName(drv);

        }catch(ClassNotFoundException ex){
            System.out.println("드라이버를 확인하세요!");
        }
        //아무것도 안뜨면 정상적으로 된것
        //Driver를 Driver1으로하면 이름이 틀렷기떄문에 드라이버를 확인하세요!라고 오류가 뜸


        //2. 데이터베이스 서버 접속
        try (

                Connection conn =
                     DriverManager.getConnection(url, usr, pwd );
        ) {
            if(conn != null)
                System.out.println("데이터베이스 연결 성공!!");
        }catch(Exception ex){
            ex.printStackTrace();
        }

        //3. vmware에 구축된 oracle 서버 접속 테스트
        String odrv = "oracle.jdbc.oracleDriver ";
        String ourl = "jdbc:oracle:thin:@192.168.147.128:1521:xe";
        String ousr = "system";

        try {
            Class.forName(odrv);
        } catch(ClassNotFoundException ex){
            System.out.println("드라이버를 확인하세요!");
        }

        try(

            Connection conn =
                    DriverManager.getConnection(ourl, ousr, pwd );
        ){
            if(conn != null)
                System.out.println("데이터베이스 연결 성공!!");
        }catch(Exception ex){
            ex.printStackTrace();
        }




        //4. vmware에 구축된 postgreSQL 서버 접속 테스트트
        String pdrv = "org.postgresql.Driver"; //class name
        String purl = "jdbc:postgresql://192.168.147.128:5432/postgres";
        String pusr = "postgres";

        try {
            Class.forName(pdrv);
        } catch(ClassNotFoundException ex){
            System.out.println("드라이버를 확인하세요!");
        }

        try(

                Connection conn =
                        DriverManager.getConnection(purl, pusr, pwd );
        ){
            if(conn != null)
                System.out.println("데이터베이스 연결 성공!!");
        }catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
