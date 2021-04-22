package YH.basic.day18;

import YH.basic.sungjuk.SungJukServiceV3;
import YH.basic.sungjuk.SungJukServiceV3Impl;
import YH.basic.sungjuk.SungJukServiceV4;
import YH.basic.sungjuk.SungJukServiceV4Impl;

import java.util.Scanner;

public class SungJukV8Main {

    // 성적처리프로그램 V8 - JDBC프로그래밍
    // 입력한 성적데이터를 DBMS이용해서 관리함
    // 따라서 프로그램 종료시 입력했던 데이터는 그대로 유지됨

    // 새로운 프로그래밍 패턴 도입: 3 layer architecture
    // 프리젠테이션 -> 비즈니스 로직 -> 데이터 액세스
    //            ~Service클래스        ~DAO 접미사가 붙은 클래스
    // 비즈니스에서 데이터 엑세스에 보낼때 v0/MAP(여러개보낼떄형태)로 넘김,
    // 데이터에서 셀렉트한 결과를 비지니스에게 LIST형태로 넘겨줌

    // SungJukServiceV4
    // JDBCUtil  (JDBC관련 정보 및 객체 생성)
    // SungJukDAO (insertSungJuk, selectSungJuk,
    //              selectOneSungJuk, updateSungJuk, deleteSungJuk)




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV4 sjsrv =
                SungJukServiceV4Impl.getInstance();

        String menu = "";
        while (true) {
            sjsrv.displayMeu();         // 화면출력 : displayMenu
                    menu = sc.next(); //메뉴라는 결과값 호출할떄 사용

            switch (menu) {
                case "1": sjsrv.newSungJuk();break;
                case "2": sjsrv.showSungJuk();break;
                case "3": sjsrv.showOneSungJuk();break;
                case "4": sjsrv.modifySungJuk();break;
                case "5": sjsrv.removeSungJuk();break;
                case "0": System.exit(0);break;
                default: System.out.println("잘못 입력하셨습니다!!");

            }

        }
    }
}