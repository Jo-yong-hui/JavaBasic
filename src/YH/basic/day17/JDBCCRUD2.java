package YH.basic.day17;

import java.sql.*;

public class JDBCCRUD2 {
    public static void main(String[] args) throws ClassNotFoundException {
        // ex) playground 데이터베이스의 books 테이블에
        // 저장된 데이터들을 조회하는 프로그램 작성
        // 조회대상 : 모든 컬럼


        //JDBC접속정보
        String drv = "org.mariadb.jdbc.Driver"; //driver를 String으로 문자화만든 후 class.forname 변수에 사용
        String amz = "";
        String url = "jdbc:mariadb://" + amz + ":3306/playground";
        String usr = "playground";
        String pwd = "bigdata2020";

        //JDBC 관련 sql 정의
        String readAll = " select * from books ";
        String readAll2 = " select bookname, price  from books ";
        String readone = " select * from books where publish = 'oracle'  ";

        Class.forName(drv);

        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery(readAll);
                // select from~ 문 받아올떄는 executeQuery로함
                // 지정한 SQL을 실행하고 결과집합을 받아옴
                // 단, select 실행시에만 사용!
                ){
            StringBuffer sb =  new StringBuffer();
            
            while(rs.next()){
                // 결과집합에서 불러올 데이터가 없을때까지 다음 반복
                sb.append(rs.getString(1))
                // 결과집합에서 첫번째 컬럼값(열)을 문자형태로 읽어옴 
                .append(rs.getString("bookname"))
                        //결과집합에서 bookname 컬럼값을 문자형태로 읽어옴
                .append(rs.getString(3))
                .append(rs.getString(4))
                        .append("\n");
            }
            System.out.println(sb.toString()); //결과 출력
        } catch(Exception ex){
            ex.printStackTrace();
        }


        // readAll2
        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(readAll2);
        ){

            StringBuffer sb =  new StringBuffer();
            while(rs.next()){
                //결과집합에서 불러올 데이터가 없을때까지 다음 반복
                sb.append(rs.getString(1)).append(" ") // " "는 hello, jave 가운데 띄어서 출력
                        .append(rs.getString(2)).append(" ")
                        .append("\n");
            }
            System.out.println(sb.toString()); //결과 출력
        } catch(Exception ex){
            ex.printStackTrace();
        }


        // readone


        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(readone);
        ){

            String fmt = "%s / %s / %s / %s  \n";
            StringBuffer sb =  new StringBuffer();

            while(rs.next()){
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4) );
                sb.append(result);

            }
            System.out.println(sb.toString()); //결과 출력
        } catch(Exception ex){
            ex.printStackTrace();
        }



    }
}
