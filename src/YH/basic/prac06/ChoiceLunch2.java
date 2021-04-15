package YH.basic.prac06;

import java.util.Random;

public class ChoiceLunch2 {
    public static void main(String[] args) {


        //배열을 이용한 점심메뉴 고르기
        String[] menu = {"김밥","라면","돈까스","우동"
                ,"짜장면","햄버거","짬뽕"};

        // random으로 난수생성하는방법
        //  Random rnd = new Random();
        // int idx = rnd.nextInt(7);

        //Math.random은 0.1 ~ 0.9까지 값을 갖는 함수다
        double magic = Math.random();
        System.out.println(magic);

        System.out.println(magic*10);
        System.out.println((int)magic*10);


        System.out.println(magic*100);

        System.out.println(magic * (45-1) + 1);


        int idx = (int)(Math.random()*7);
        System.out.println(menu[idx]);

    }


}
