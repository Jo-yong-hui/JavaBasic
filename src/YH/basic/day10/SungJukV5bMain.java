package YH.basic.day10;

import YH.basic.sungjuk.SungJukService;
import YH.basic.sungjuk.SungJukServiceImpl;
import YH.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
           // SungJukService sjsrv = new SungJukServiceImpl();
        // 인터페이스를 구현한 클래스는 클래스이름 끝에 Impl 접미사를 추가해줌
        SungJukService sjsrv = SungJukServiceImpl.getInstance();
        //왼쪽 부모클래스 오른쪽 자식클래스이다. 오른쪽 자식클래스가 왼쪽 부모클래스 하는데 업캐스팅

            SungJukVO sj = sjsrv.readSungJuk();
            sjsrv.ComputeSungJuk(sj);
            sjsrv.printSungJuk(sj);

    }

}
