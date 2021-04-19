package YH.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        // 이름, 국어, 영어, 수학을 키도브로 입력받아
        // sungjuk.dat에 저장하는 코드를 작성하세요
        // 단, 파일에 저장하는 문자열 형식은 다음과 같이 합니다.

        // 입력 데이터: 혜교 97 98 95
        // 파일 저장 형식 : 혜교, 97, 98, 95

        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;

        Scanner sc = new Scanner(System.in);

        //System.out.println("이름은?");
        //name = sc.next();
        //System.out.println("국어는?");
        //kor = sc.nextInt();
        //System.out.println("영어는?");
        //eng = sc.nextInt();
        //System.out.println("수학은?");
        //mat = sc.nextInt();

        // 빈칸만큼 띄어서 데이터 출력하기
        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        // 입력받은 성적데이터를 파일에 저장
        String fpath = "c:/java/sungjuk.dat";

        FileWriter fw = null;
        BufferedWriter bw = null;

        // ,true로 append놓으면 이름 ,국어,영어 새로 입력할떄마다 데이터가 누적됨
        try {
            fw = new FileWriter(fpath, true);
            //파일에 데이터 누적 옵션 설정
            bw = new BufferedWriter(fw);

            //bw.write(name + "," + kor + "," +
            //             eng + "," + mat + "\n");
            // 밑에 방식이더 깔끔

            String fmt = "%s,%d,%d,%d\n";
            String data = String.format(
                    fmt, name, kor, eng, mat);
            bw.write(data);

            bw.close();
            fw.close();  //파일 쓰기종료
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 저장한 성적데이터를 화면에 출력
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
            fr.close();
        } catch(Exception ex) {
            ex.printStackTrace();

        }
    }
}



