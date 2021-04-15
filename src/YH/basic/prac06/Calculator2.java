package YH.basic.prac06;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

//        //간단히 계산 프로그램 작성
//        // 두수를 입력받아 더하기를 수행하는 프로그램 작성1
//       // Scanner 객체 생성. 생성후 ctrl space로 jave.utill Scanner 누른다
//            int a, b;
//            int sum = 0;
//            Scanner sc  = new Scanner(System.in);
//            System.out.println("두수를 입력받습니다");
//            System.out.println("첫번째 숫자는?");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         sum = a + b;
//
//         String fmt = " 입력받은 수는 각각 %d, %d이고요\n" +
//                      " 두 수의 총합은 %d입니다\n";


        //ex) 두수를 입력받아 더하기를 수행하는 프로그램 작성2
        plusTwo2();
    }

    public static void plusTwo2(){
        int a, b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(" 두수를 입력받습니다");
        System.out.println("첫번째 숫자는?");
        a = sc.nextInt();
        System.out.println(" 두전쨰 숫자는?");
        b = sc.nextInt();

        sum = a + b;

        String fmt = " 입력받은 수는 각각 %d, %d이고요\n" +
                    "두 수의 총합은 %d입니다\n";
        System.out.printf(fmt, a,b,sum);

    }


}
