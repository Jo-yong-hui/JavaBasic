package YH.basic.sungjuk;

public class SungJukServiceImpl implements SungJukService {

    // 싱글톤 패턴 시작
    private static SungJukService sjsrv = null;
    private SungJukServiceImpl() {
    }

    public static SungJukService getInstance(){
        if (sjsrv == null) sjsrv = new SungJukServiceImpl();
        return sjsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void displayMeu() {
        String displaymenu =
                "--------------------- \n" +
                        "    성적 프로그램 v3     \n" +
                        "--------------------- \n" +
                        " 1. 성적데이터 입력       \n" +
                        " 2. 성적데이터 조회       \n" +
                        " 3. 성적데이터 상세조회    \n" +
                        " 4. 성적데이터 수정       \n" +
                        " 5. 성적데이터 삭제       \n" +
                        " 0. 프로그램 종료        \n" +
                        "--------------------- \n" +
                        " 작업을 선택하세요 : ";
        System.out.print(displaymenu);

    }

    @Override
    public SungJukVO readSungJuk() {
        return null;


    }

    @Override
    public void ComputeSungJuk(SungJukVO sj) {

    }

    @Override
    public void printSungJuk(SungJukVO sj) {

    }
}