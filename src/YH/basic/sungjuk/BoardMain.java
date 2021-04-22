package YH.basic.sungjuk;

import java.util.Scanner;

public class BoardMain {

    //BoardService
    //JDBCUtil  (JDBC관련 정보 및 객체 생성)
    // BoardDAO (insertBoard, selectBoard,
    //              selectOneBoard, updateBoard, deleteBoard)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardService bdsrv =
                BoardServiceImpl.getInstance();

        String menu = "";
        while (true) {
            menu = sc.next(); //메뉴라는 결과값 호출할떄 사용

            switch (menu) {
                case "1":
                    bdsrv.newBoard();break;
                case "2": bdsrv.showBoard();break;
                case "3": bdsrv.showOneBoard();break;
                case "4": bdsrv.modifyBoard();break;
                case "5": bdsrv.removeBoard();break;
                case "0": System.exit(0);break;
                default:
                    System.out.println("잘못 입력하셨습니다!!");

            }
        }
    }
}