package YH.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    public static void main(String[] args) {
        // 이름, 국어, 영어, 수학을 키보드로 입력받아
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

        // 빈칸만큼 띄어서 한꺼번에 데이터 출력하기
        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        // 입력받은 성적데이터를 파일에 저장
        String fpath = "c:/java/sungjuk.dat";


        // FileWriter는 파일에 문자 단위로 출력하는 스트림 클래스
        //  BufferedWriter : 문자로 쓸때 배열을 제공하여 한꺼번에 쓸 수 잇는 기는 제공
        FileWriter fw = null;
        BufferedWriter bw = null;

        // try catch 구문은 오류를 발견하고 핸들링하기 위하여 사용됩니다.
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
        FileReader fr = null; // FileReader : 파일에서 문자 단위로 읽는 스트림 클래스
        BufferedReader br = null;
        // 문자로 읽을때 배열을 제공하여 한꺼번에 읽을 수 있는 기능 제공


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



