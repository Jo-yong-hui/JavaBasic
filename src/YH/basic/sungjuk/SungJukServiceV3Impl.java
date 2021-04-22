package YH.basic.sungjuk;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SungJukServiceV3Impl implements SungJukServiceV3 {

    // 멤버변수 선언
    // 입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();
    SungJukVO sj = null;

    // 성적데이터를 저장해둘 파일경로 지정
    String fpath = "c:/java/SungJuk.data";
    String fpath2 = "c:/java/SungJuk.csv";
    String fpath3 = "c:/java/SungJuk.json";


    // CSV 직렬화를 위한 문자열 포맷
    String csvfmt = "%S, %d, %d, %d, %d,%.1f, %s\n";


    // JSON 직렬화를 위한 문자열 포맷
    String jsonfmt = "{\"name\": \"%s\", \"kor\": %d, \"eng\": %d,\"mat\": %d," +
            "\"tot\":%d, \"avg\":%.1f, \"grd\":\"%s\"},\n";


    // 싱글톤 패턴 시작
    private static SungJukServiceV3 sjsrv = null;

    private SungJukServiceV3Impl() {
        // 프로그램 시작시 initSungJuk 메서드 호출
        initSungJuk();

    }

    public static SungJukServiceV3 getInstance() {
        if (sjsrv == null) sjsrv = new SungJukServiceV3Impl();
        return sjsrv;
    }
    // 싱글톤 패턴 끝

    @Override
    public void displayMeu() {
        String displaymenu =
                "--------------------- \n" +
                        "    성적 프로그램 v7     \n" +
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
    public void newSungJuk() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("이름은?");
            String name = sc.next();
            System.out.print("국어는?");
            int kor = sc.nextInt();
            System.out.print("영어는?");
            int eng = sc.nextInt();
            System.out.print("수학은?");
            int mat = sc.nextInt();

            SungJukVO sj = new SungJukVO(name, kor, eng, mat);
            // 입력받은 성적데이터를 객체화함
            computeSungJuk(sj);
            // 성적데이터 처리
            sjdata.add(sj);
            //처리된 성적데이터를 동적배열에 저장

            //방금 입력된 성적데이터와
            //기존에 입력된 성적데이터 모두를
            //sungjuk.data 파일에 직렬화해서 저장함
            // 적재가 주목적일경우 사용


            //2) 성적입력 : newSungJuk
            //2-1) 데이터저장 : saveSungJuk
            //newSungJuk에 saveSungJuk한 이유 - 데이터가 생길떄마다 저장
            //saveSungJuk();
        } catch (Exception ex) {
            System.out.println("잘못입력하셨습니다!");
            return;    //특정코드 실행하고 중단하고 싶을떄 사용, 오류발생시 실행중단하고 main으로 복귀
        }


    }

    // 저장된 성적데이터들 중에서
    // 배열인덱스, 이름, 국어, 영어, 수학만 뽑아서
    // 목록List형태로 출력
    @Override
    public void showSungJuk() {
        String fmt = "번호: %d, 이름:%s, 국어:%d 영어:%d 수학:%d \n";
        int pos = 0; //배열인덱스 //pos: 입력시 학생번호가 0, 1 ...값 출력됨

        for (SungJukVO sj : sjdata) {
            System.out.printf(fmt, pos, sj.getName(), sj.getKor()
                    , sj.getEng(), sj.getMat());
            ++pos;
        }

    }

    @Override
    public void computeSungJuk(SungJukVO sj) {

        sj.setTot(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setAvg((double) sj.getTot() / 3);

        switch ((int) sj.getAvg() / 10) {
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default:sj.setGrd('가'); break;

        }
    }


    @Override
    public void showOneSungJuk() {
        String fmt = "번호: %d, 이름:%s, 국어:%d 영어:%d 수학:%d \n"
                + "총점:%d, 평균:%.1f, 학점:%c\n";

        Scanner sc = new Scanner(System.in);
        System.out.print(" 조회할 학생의 번호는? ");
        int pos = sc.nextInt();


        // 예외처리코드 이용하면 프로그램 중단되는걸 막음
        try {
            SungJukVO sj = sjdata.get(pos);

            System.out.printf(fmt, pos,
                    sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(),
                    sj.getTot(), sj.getAvg(), sj.getGrd());
        } catch (Exception ex) {
            System.out.println("데이터가 존재하지 않습니다!!");

        }
    }

    @Override
    public void modifySungJuk() {

    }

    @Override
    public void removeSungJuk() {

    }

    // 역직렬화 = 스트림으로부터 객체를 입력 = ObjectInputStream 사용
    // 기존에 입력된 성적데이터를 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    //try : try 문 안에 있는 코드들이 에러가 발생하는 경우 catch 문으로 전달합니다.
    //catch : try 에서 발생한 예외처리를 진행합니다.
    @Override
    public void initSungJuk() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fpath);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            sjdata = (ArrayList) ois.readObject();


            // close부분은 finally부분으로 뺀것 그래서 위 코드가 짧아 보임
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다!@!@");
        } finally {
            if (ois != null)
                try { ois.close(); } catch (IOException e) { }
            if (bis != null)
                try { bis.close(); } catch (IOException e) { }
            if (fis != null)
                try { fis.close(); } catch (IOException e) {
                }

        }

    }


    // 메모리내에 저장된 모든 성적데이터를
    // 직렬화를 통해 파일에 저장
    @Override
    public void saveSungJuk() {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fpath);
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(sjdata);

        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("파일이 없거나 시스템 오류입니다!@!@");
        } finally { if (oos != null) try { oos.close(); }
                                    catch (IOException e) { }

            if (bos != null) try { bos.close(); }
                                catch (IOException e) { }

            if (fos != null)
                try { fos.close(); } catch (IOException e) { }


        }
    }

    // 기존에 입력된 성적데이터를 csv 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk2() {
        //try-with-resources 구문 사용
        try (
                FileReader fr = new FileReader(fpath2);
                BufferedReader br = new BufferedReader(fr);
        ) {
            sjdata = new ArrayList<>(); //sjdata 초기화
            while (br.ready()) {
                // csv파일에서 문자열 한줄을 읽어서
                // 쉼표단위로 분리한 후 배열로 생성
                String line = br.readLine();
                String data[] = line.split(",");

                // 생성된 배열을 이용해서 성적객체를 만들어
                // 총점, 평균, 학점을 구한 다음 (옵션사항)
                // ArrayList에 저장함 [1],[2],[3]

                SungJukVO sj = new SungJukVO(
                        data[0], Integer.parseInt(data[1]),
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]));
                computeSungJuk(sj);

                sjdata.add(sj); //sjdata에 성적데이터 입력
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 메모리내에 저장된 모든 성적데이터를
    // csv직렬화를통해 파일에 저장
    @Override
    public void saveSungJuk2() {


        // JDK7부터는 자원을 쉽게 해제할 수 있도록
        // try-with-resources라는 구문을 지원함
        try (
                FileWriter fw = new FileWriter(fpath2);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String result = "";
            for (SungJukVO sj : sjdata) {  //sjdata를 파일을 저장하수 없어서 성적 vo 직렬화로 문자로 바꿈
                result = String.format(csvfmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()
                        , sj.getTot(), sj.getAvg(), sj.getGrd());
                //csv형식으로 문자화 한것이다.
                // 예시로 혜교, 54, 76 ,98 ,265 , 99.3 수 형태로 문자만들어서
                // bw.write(result)파일에 기록
                //즉 sjdata를 bw.write(result)파일에 저장한 파일형태로 저장하는
                // (Csv)파일직렬화이다.

                bw.write(result);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // 기존에 입력된 성적데이터를 csv 역직렬화로
    // 파일에서 읽어서 메모리에 적재하는 기능 담당
    @Override
    public void initSungJuk3() {
        //try-with-resources 구문 사용
        try (
                FileReader fr = new FileReader(fpath3);
                BufferedReader br = new BufferedReader(fr);
        ) {
            // json파일의 모든 내용을 한번에 읽어 lines 변수에 저장
            String lines = br.lines().collect(Collectors.joining());
            System.out.println(lines);

            // 텍스트파일에 저장된 반정형데이터를
            // JSON 분석기(parser)를 이용해서
            // 메모리에 객체형태로 저장함
            // v7cmain에서 출력되는지 확인후
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(lines);

            //메모리에 저장된 객체에서 sj라는 이름의 배열객체를 가져옴
            JSONArray jsons = (JSONArray) obj.get("sj");

            // 반복문을 이용해서 배열객체의 각 요소를 하나씩 꺼내
            // 성적객체에 담고 ArrayList에 저장함
            for (int i = 0; i < jsons.size(); ++i) {
                JSONObject json = (JSONObject) jsons.get(i);
               SungJukVO sj = new SungJukVO(
                       (String)json.get("name"),
                       ((Long) json.get("kor")).intValue(),
                       ((Long) json.get("eng")).intValue(),
                       ((Long) json.get("mat")).intValue()  );
                       computeSungJuk(sj);
                       sjdata.add(sj);
                //그냥 int로 하면 문자를 숫자로 바꾸기 에러떠서 Long으로 씌워줌

            }


        } catch (
                Exception ex) {
            ex.printStackTrace();
        }
    }

        @Override
        public void saveSungJuk3 () {


            //매모리내에 저장된 모든 성적데이터를
            //json직렬화를 통해 파일에 저장
            try (
                    FileWriter fw = new FileWriter(fpath3);
                    BufferedWriter bw = new BufferedWriter(fw);
            ) {
                String result = "";
                bw.write("{ \"sj\":["); // json 배열 시작
                for (SungJukVO sj : sjdata) {  //sjdaa를 파일 저장하수 없어서 성적 vo 직렬화로 문자로 바꿈
                    result = String.format(jsonfmt, sj.getName(), sj.getKor(), sj.getEng(),
                            sj.getMat(), sj.getTot(), sj.getAvg(), sj.getGrd());
                    // { 'name': '혜교', 'kor: 54, 'eng':76, 'mat': 98,
                    // 'tot': 265, 'avg': 99.3, 'grd' : 수 }, 형태

                    bw.write(result);
                }
                bw.write("] }"); //json 배열 끝
            } catch (Exception ex) {
                ex.printStackTrace();


            }

        }
    }

