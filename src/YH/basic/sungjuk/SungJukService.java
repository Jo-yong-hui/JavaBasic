package YH.basic.sungjuk;

public interface SungJukService {
    
        
        // 성적 서비스 v1
        // 입력, 처리, 출력 기능 구현
        // 프로그램 메뉴 출력 기능 추가

         void displayMeu();
         SungJukVO readSungJuk();
         void ComputeSungJuk(SungJukVO sj);
         void printSungJuk(SungJukVO sj);

     }

    

