package YH.basic.day11;

import java.util.Scanner;

public class WraperClass {
    public static void main(String[] args) {
        // wraper class
        // 프로그램에 따라 기본 자료형의 데이터를 참조자료형으로
        // 바꿔 취급해야 할 때가 있음
        // 메서드의 매개변수가 객체형을 요구하면
        // 그에 따라 객체형을 사용해야 함
        // 기본자료형 변수를 참조자료형 변수로 변환하는 클래스를
        // 래퍼클래스라 함
        // int -> Integer, double -> Double
        // char -> Character, boolean -> Boolean

        int a = 123;
        Integer b = new Integer((a)); //위 인트를 클래스형태로 바꾼것
        //박싱 : 기본자료형 변수를 참조자료형변수로 변환
        
        System.out.println(a);
        System.out.println(b);
        //박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변환함
        
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나입력하세요"); //System.out.println(Integer.toBinaryString(4)); 이거실행

        int number = Integer.parseInt(sc.next()); //sn.next()라는 문자를 integer정수로 변화한다.
        //문자 입력값을 정수로 변환함
        
        
        int c = b.intValue();
        // 언박싱 : 참조자료형변수를 기본자료형 변수로 변환

        Integer d = 456; //new Integer 사용 안함, 사용한거랑 똑같은걸로 취급됨
        // 자동 박싱 적용

        int e = d;  // intvalue를 사용 안함
        // 자동 언박싱 적용

        // 10진수로 2진수로 변환하기
        // 데이터 타입4를 2진수 문자열로 반환했더니 => 100 나옴  //10이 아니라 1빵빵 이다.
        System.out.println(Integer.toBinaryString(4));

        // 두 수를 비교해서 큰지, 같은지, 작은지를 출력
        // compareTo(수1 , 수2 )
        // 결과 : 1, 0, -1
        System.out.println( b.compareTo(d) );
        System.out.println(Integer.compare(b,d));
    }    

}
