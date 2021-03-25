package YH.basic.day07;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        //생년월일을 입력받아 나이 계산
        //현재연도 - 생년년도
        //생일이 지났으면 그대로 사용
        //생일이 지나지않았으면 + 1
//       int byear, bmonth, bday ; // 생년월일
        //       int cyear, cmonth, cday ; // 현재년월일
        //       Scanner sc = new Scanner(System.in);
        //      String fmt = "현재 : %d년 %d월 %d일\n"+
        //                   "생일 : %d년 %d월 %d일\n"+
        //                   "나이 : %d세 ";

        // 현재년월일 설정
        //   cyear = 2021;
        //    cmonth = 3;
        //   cday = 24;


        // 생년월일 입력받음
        // System.out.print("생일의 년도는?");
        // byear = sc.nextInt();
        // System.out.print("생일의 월은?");
        // bmonth = sc.nextInt();
        // System.out.print("생일의 일은?");
        // bday = sc.nextInt();

        // 나이계산
        //int age = cyear - byear;  // 현재년도 - 생일년도
        // if (cmonth > bmonth && cday > bday)  // 생일지남여부
        //   age = age + 1;
        // else
        //   age = age - 1;

        // System.out.printf(fmt,cyear,cmonth,cday,
        //                 byear,bmonth,bday,age);

//        computeAge();

        // 잔돈 계산하는 프로그램
        // 지불요구금액 : 54320원
        // 지불액 : 100000원
        // 잔돈 : 45680원
//        int price, pay, change;
//        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;
//        String fmt = "사용요금은 %d, 지불액은 %d 일떄, 잔돈은 %d 입니다 \n" +
//                "50000원권은 %d 장, 10000원권은 %d 장, \n" +
//                "5000원권은 %d 장, 1000원권은 %d 장, \n" +
//                "500원권은 %d 개, 100원은 %d 개, \n" +
//                "50원은 %d 개, 10원은 %d 개입니다";
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("사용요금은?");
//        price = sc.nextInt();
//        System.out.print("지불금액은?");
//        pay = sc.nextInt();
//
//
//        // 잔돈 계산
//        change = pay - price;       // 67890
//
//        w50000 = change / 50000;    // w50000원 50000원권 1장이라는 변수의미이다.
//        //change = change - (50000 * w50000); //(50000 * W50000)이것도 50000권 한장이라는 변수의미.
//        change = change % 50000;
//
//        w10000 = change / 10000;
//        //  change = change - (10000 * w10000);
//        change = change % 10000;
//
//        w5000 = change / 5000;
//        //  change = change - (5000 * w5000);
//        change = change % 5000;
//
//        w1000 = change / 1000;
//        //  change = change - (1000 * w1000);
//        change = change % 1000;
//
//        w500 = change / 500;
//        //  change = change - (500 * w50000);
//        change = change % 500;
//
//        w100 = change / 100;
//        //  change = change - (100 * w100);
//        change = change % 100;
//
//        w50 = change / 50;
//        //  change = change - (50 * w50);
//        change = change % 50;
//
//        w10 = change / 10;
//
//
//        System.out.printf(fmt, price, pay, (pay - price),
//                w50000, w10000, w5000, w1000, w500,
//                w100, w50, w10);

//    }
        computeChange();
    }

    public static void computeAge() {
        //생년월일을 입력받아 나이 계산
        //현재연도 - 생년년도
        //생일이 지났으면 그대로 사용
        //생일이 지나지않았으면 + 1
//       int byear, bmonth, bday ; // 생년월일
        //       int cyear, cmonth, cday ; // 현재년월일
        //       Scanner sc = new Scanner(System.in);
        //      String fmt = "현재 : %d년 %d월 %d일\n"+
        //                   "생일 : %d년 %d월 %d일\n"+
        //                   "나이 : %d세 ";

        // 현재년월일 설정
        //   cyear = 2021;
        //    cmonth = 3;
        //   cday = 24;


        // 생년월일 입력받음
        // System.out.print("생일의 년도는?");
        // byear = sc.nextInt();
        // System.out.print("생일의 월은?");
        // bmonth = sc.nextInt();
        // System.out.print("생일의 일은?");
        // bday = sc.nextInt();

        // 나이계산
        //int age = cyear - byear;  // 현재년도 - 생일년도
        // if (cmonth > bmonth && cday > bday)  // 생일지남여부
        //   age = age + 1;
        // else
        //   age = age - 1;

        // System.out.printf(fmt,cyear,cmonth,cday,
        //                 byear,bmonth,bday,age);
    }

    public static void computeChange() {
        int price, pay, change;
        int[] wons = new int[8]; //{0,0,0,0,0,0,0,0}; 도 같음
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        String fmt = "사용 금액 : %d \n" +
                "지불금액 : %d\n"+
                "잔돈 : %d \n"+
                "50000원 :  %d\n"+
                "10000원 : %d\n"+
                "5000원 : %d\n"+
                "1000원 : %d\n"+
                "500원 : %d\n"+
                "100원 : %d\n"+
                "50원 : %d\n"+
                "10원 : %d\n";

        Scanner sc = new Scanner(System.in);

        System.out.print("사용요금은?");
        price = sc.nextInt();
        System.out.print("지불금액은?");
        pay = sc.nextInt();

        change = pay - price;

        for(int i = 0; i < wons.length; ++i) {
            wons[i] = change / notes[i];
            change = change % notes[i];
        }
        System.out.printf(fmt, price, pay, (pay - price),
                wons[0], wons[1], wons[2], wons[3],
                wons[4], wons[5], wons[6], wons[7]);

    }

    public static class SungJukV3b {
    
        // 성적처리프로그램을 체계적으로 만들려고 함
        // 배열과 메서드로 효율적으로 코드를 재작성함
        
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String menu = "";

            while(true) {
                displayMenu();   //프로그램 메뉴 표시
                menu = sc.next();

            
            switch(menu) {  // JDK 7부터는 switch문에 문자형 사용가능
                case "1" : addSungJuk(); break;
                case "2" : System.out.println("성적데이터 조회"); break;
                case "3" : System.out.println("성적데이터 상세조회"); break;
                case "4" : System.out.println("성적데이터 수정"); break;
                case "5" : System.out.println("성적데이터 삭제"); break;
                case "0" : System.exit(0); break; //프로그램 종료
                default : System.out.println("잘못입력!!");
            } //switch 괄호
        } //while 괄호
            
      } //main 괄호

        //메뉴 출력하는 메서드 - displayMenu
        public static void displayMenu() {
            String displaymenu =
                "-------------------\n" +
                "     성적 프로그램 v3   \n" +
                "-------------------\n" +
                " 1. 성적데이터 입력 \n" +
                " 2. 성적데이터 조회 \n" +
                " 3. 성적데이터 상세조회 \n" +
                " 4. 성적데이터 수정 \n" +
                " 5. 성적데이터 삭제 \n" +
                " 6. 성적데이터 종료 \n" +
                "--------------------\n" +
                " 작업을 선택하세요 : ";

            System.out.print(displaymenu);
        }


        //성적 입력 및 처리 결과 출력
        public static void addSungJuk(){
            String name;
            int kor, eng, mat, tot;
            double avg;
            char grd;

            Scanner sc = new Scanner(System.in);

            System.out.print("이름은?");
            name = sc.next();
            System.out.print("국어는?");
            kor = sc.nextInt();
            System.out.print("영어는?");
            eng = sc.nextInt();
            System.out.print("수학은?");
            mat = sc.nextInt();

            tot = kor + eng + mat;
            avg = (double)tot / 3;
            switch((int)avg/10){
                case 10: case 9: grd = '수'; break;
                case 8: grd='우'; break;
                case 7: grd='미'; break;
                case 6: grd='양'; break;
                default: grd='가'; break;
                 }
            String fmt = "%s %d %d %d\n%d %.1f %c\n\n";
                System.out.printf(fmt, name, kor, eng, mat,
                        tot, avg, grd);


            }

        }
    } //Sungjukv3 괄호


