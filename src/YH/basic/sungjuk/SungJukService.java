package YH.basic.sungjuk;

public interface SungJukService {
    // 인터페이스 재정의된 impl는 implement로 처음에 인터페이스로 정의한 메서드를 데려오는거다.
    // 인터페이스 하는이유는 impl 새로운 객체를 만들어 인터페이스 만든 메서드를 가져오기위한것이다.
        
        // 성적 서비스 v1
        // 입력, 처리, 출력 기능 구현
        // 프로그램 메뉴 출력 기능 추가

         void displayMeu();
         SungJukVO readSungJuk();
         void ComputeSungJuk(SungJukVO sj);
         void printSungJuk(SungJukVO sj);

     }

    

