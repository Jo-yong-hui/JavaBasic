package YH.basic.day06;

import java.util.Random;

public class ChoiceLunch {
    public static void main(String[] args) {
        //배열을 이용한 점심메뉴 고르기
        String[] menu = {"김밥","라면","돈까스","우동"
                ,"짜장면","햄버거","짬뽕"};
        // 점심메뉴를 배열로 정의
        //Random rnd = new Random();
        //int idx = rnd.nextInt(7);
        //난수 생성 1
        //메뉴는 7개이므로 idx변수의 범위는 0~6 이므로 총 7개여서 nextint에 7이 들어감
        
        //Math.random을 이용해서 실제 난수가
        // 만들어지는 원리를 알아봄
        double magic = Math.random();
        System.out.println(magic);
        
        //0 ~ 9 사이 임의의 난수 생성
        System.out.println(magic*10);
        System.out.println((int)(magic*10));

        //0 ~ 99사이 임의의 난수 생성
        System.out.println((int)(magic*100));


        // 0 ~ (n-1) 범위 난수 : random  * b
        // 0 ~ (100-1) 범위 난수
        System.out.println((int)(magic * 100));

        // a이상 b미만 범위 난수
        // -> ( random * ( 최대값 - 최솟값)) + 최소값
        // 1 ~ 45 범위 난수
        System.out.println((int)(magic % (45 - 1) + 1));


        //메뉴출력을 위한 난수 생성 표현식
        int idx = (int)(Math.random() *  7);
        System.out.println(menu[idx]);
        //생성된 난수로 선택된 메뉴 출력


        //Math.random() 함수는 0.0~0.9까지 임의의 수를 나타내는 메소드 입니다
        //(Math.random()*표현하고싶은 범위)이며 뒤에 +1은 0.9999*6을 해봤자 아무리 커도
        //5.9999밖에 안되기 때문에 +1을 더해서 소수점 앞을 6으로 만들어서 Integer타입으로
        //강제 형변환을 한 것입니다.

    }
}
