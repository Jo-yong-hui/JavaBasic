package YH.basic.prac06;

public class break2 {
    public static void main(String[] args) {

        int sum = 0;
        int i;

        for( i = 0; i <= 100; ++i){
            sum += i;
            if(sum >= 500) break;
        }
        System.out.println(" 총합 : " + sum);
        System.out.println(" 중지지점 : " + i);

        int dice = ((int) Math.random() * 6) + 1;
        int count = 0;

//        0.0 <= Math.random()메소드 <  1.0 값을 갖는다.
//        제일 큰숫자가 0.9이다
//        그래서 Math.random()&6을 해도 0.54가 제일 큰수이다 int 정수만 뽑아내면
//        정수 5가 된다. 그래서 주사위 숫자 6이 나오게하려면 여기다가 숫자 1를 더해주면 된다.
        while(true){
            dice = (int) (Math.random() * 6) + 1;
            ++count;
            System.out.print(dice + "");
            if (dice == 6) break;
        }
        System.out.println(" 굴린 총 횟수:" + count);


    }

}
