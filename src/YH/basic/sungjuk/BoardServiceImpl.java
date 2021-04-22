package YH.basic.sungjuk;

import java.util.Scanner;

public class BoardServiceImpl implements BoardService {

    // 싱글톤 패턴 시작
    private static BoardService bdsrv = null;
    private BoardServiceImpl() {
    }

    public static BoardService getInstance() {
        if (bdsrv == null) bdsrv = new BoardServiceImpl();
        return bdsrv;

    }


    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("글번호는?");
            String name = sc.next();
            System.out.print("제목은?");
            String title = sc.next();
            System.out.print("작성자는?");
            String userid = sc.next();
            System.out.print("작성일은?");
            String regdate = sc.next();
            System.out.print("조회수는?");
            int views = sc.nextInt();
            System.out.print("추천수는?");
            int thumbup = sc.nextInt();
            System.out.print("본문은?");
            String contents = sc.next();


        }catch(Exception ex){
            System.out.println("잘못입력하셨습니다!");
            return;    //특정코드 실행하고 중단하고 싶을떄 사용, 오류발생시 실행중단하고 main으로 복귀
        }



    }

    @Override
    public void showBoard() {
        String fmt = " 번호: %d 제목:%s 작성자:%s 작성일:%s " +
                " 조회수:%d 추천수:%d 본문: %s \n";
        int pos = 0; //배열인덱스 //pos: 입력시 학생번호가 0, 1 ...값 출력됨

        for(BoardVO bd : bddata){
            System.out.printf(fmt,pos bd.getName(),sj.getKor()
                    ,sj.getEng(),sj.getMat());
            ++pos; //여기서 pos는 position
        }

    }

    @Override
    public void showOneBoard() {
        String fmt = " 번호: %d 제목:%s 작성자:%s 작성일:%s " +
                " 조회수:%d 추천수:%d 본문: %s \n";
        Scanner sc = new Scanner(System.in);

        System.out.println("조회할 게시판의 번호는?");
        int bdno = sc.nextInt();
        BoardVOVO bd = sjdao.selectOneSungJuk(sjno);

        String result = String.format(fmt, sj.getSjno(),
                sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),
                sj.getTot(),sj.getAvg(),sj.getGrd(), sj.getRegdate());

        System.out.println(result);


    }

    @Override
    public void modifyBoard() {

    }

    @Override
    public void removeBoard() {

    }
}
