package YH.basic.day10;

import YH.basic.sungjuk.SungJukService;
import YH.basic.sungjuk.SungJukServiceImpl;
import YH.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5cMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  SungJukService sjsrv = new SungJukServiceImpl();  SungJukServiceImpl() 객체 하나만든다는걸로 기억하기
        // 밑에 보면 싱글톤방식으로 변환한게 보인다.
        
        
        // sjsrvs는 인스턴스 변수이므로 객체마다 개별적으로 생성됨
        // 정적변수로 만들어서 모든 객체가 이것을 공유하도록 변경해야함
        // singleton 페턴을 이용해서 여러 객체가 단일 객체로만 생성되도록 제한함

        // 인터페이스를 구현한 클래스(상속받은 하위클래스)는 클래스이름 끝에 Impl 접미사를 추가해줌
        SungJukService sjsrv = SungJukServiceImpl.getInstance();
        //singleton 패턴을 이용해서 객체 생성
        
        String menu = ""; //""는 빈문자열을 의미
        SungJukVO sj = null; //클래스 초기값 null로함
                
                
        while(true){
            sjsrv.displayMeu();
            menu = sc.next(); //메뉴라는 결과값 호출할떄 사용

            switch(menu){
                case "1" :  sjsrv.readSungJuk(); //리드성적 호출후 바로 컴퓨터성적 호출
                            sjsrv.ComputeSungJuk(sj); break;
                case "2" : break;
                case "3" : sjsrv.printSungJuk(sj);break;
                case "4" : break;
                case "5" : break;
                case "0" : System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다!!");
            }

        }
    }
}
