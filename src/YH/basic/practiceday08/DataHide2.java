package YH.basic.practiceday08;

import YH.basic.day07.B;

public class DataHide2 {
    public static void main(String[] args) {
        // 캡슐화 capsulation
        // 사용자가 굳이 알필요가 없는 정보는
        // 사용자로부터 숨겨야 한다는 개념
        // 최소한의 정보만으로 프로그램을
        // 쉽게 이해하고 사용할 수 있음

        // 접근지정자(access modifier)
        // 클래스와 멤버변수, 메서드 선언시
        // 정보은닉 정도를 부여할 수 있음

        // 자바의 4가지 접근지정자
        // private > default > protected > public

        A one = new A();   // 동일 패키지내 클래스
        System.out.println(one.c); //public 변수
        System.out.println(one.a); //default 변수
        //System.out.println(one.b); // private 변수// private화 되있어서 접근불가 즉, hide된거임

        B two = new B();   // 다른 패키지내 클래스 //alt + enter로 day07패키지에 있는 B클래스를 불러올수있음
//        System.out.println(two.d); //default : 같은 페이지내에서만 접근가능, 다른 패키지이므로 접근 불가
//        System.out.println(two.e); //private (자기자신만)가능
//        System.out.println(two.f); //public

    } // main
} // class

class A{
    int a;          // default 접근지정
    private int b;  // private 접근지정
    public int c;   // public 접근지정
}


