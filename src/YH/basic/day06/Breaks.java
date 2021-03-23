package YH.basic.day06;

import java.util.Scanner;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) : 1 ~ 100까지의 총합을 구하는 프로그램 작성
        // 단, 총합이 500을 넘는 경우, 실행을 중단함
        int sum = 0;
        int i; //int i;를 여기다가 줌으로써 for안에 int를 없애고, {}범위 밖에서도 i를 쓸 수 있게된다.

        for (i = 0; i <= 100; ++i) {
            sum += i;
            if (sum >= 500) break;
            //부분합이 500이상인 경우 반복실행을 중지함
        }
        //위에 i는 {} 내에서 선언 변수이기 떄문에 범위 넘어가면 i를 중복해서 쓸 수 없다.
        //for문 밖에 i선언하면 중복해서 쓸수잇다.
        System.out.println(" 총합 : " + sum);
        System.out.println(" 중지지점 : " + i);

        // ex) 주사위의 눈이 6이 나올떄까지 굴려보는
        // 프로그램을 작성하세요. 또한, 6이 나올때까지의
        // 굴린 횟수도 같이 출력하세요
        // Math.random()과 break문을 사용
        int dice = ((int) Math.random() * 6) + 1;
        int count = 0;
        while (true) {
            dice = (int) (Math.random() * 6) + 1;
            ++count; //주사위 굴린 횟수
            System.out.print(dice + "");
            if (dice == 6) break;
        }
        System.out.println("굴린 총 횟수 : " + count);


    }
}

