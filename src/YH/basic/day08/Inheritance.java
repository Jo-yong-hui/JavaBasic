package YH.basic.day08;

public class Inheritance {

    public static void main(String[] args) {
        // 상속
        // 객체지향 3대 개념의 하나
        // 기존의 클래스에 기능을 추가하거나 재정의해서
        // 새로운 클래스를 만드는 것을 의미
        
        // 상속을 이용하면 기존에 만들어둔 클래스의
        // 모든 필드와 메서드를 이용해서
        // 새로운 클래스를 편리하게 만들수 있음
        // 기존 클래스를 부모/상위/슈퍼 클래스라 하고
        // 새롭게 작성된 클래스를 자식/하위/서브 클래스라 함
        
        
        // 상속의 장점
        // 1. 기존에 작성된 클래스를 재활용 할 수 있다.
        // 2. 클래스의 계층 구조파악 용이
        // 3. 소프트웨어 생산성 향상된다.

        // 상속형식 순서
        // class 클래스명 extends 부모클래스

        Tiger2 t = new Tiger2();
        System.out.println(t.eye);
        System.out.println(t.leg);
        System.out.println(t.mouth);
        
        

    }
}

class Eagle {
    //필드
     String eye;
     int mouth;
     int wing;

    //메서드
    public void eat(){}
    public void sleep(){}
    public void fly(){}

    }

    class TIger{
        //필드
        String eye;
        String mouth;
        String leg;

        //메서드
        public void eat(){}
        public void sleep(){}
        public void run(){}

    }

    class Goldfish {
        String eye;
        String mouth;
        String fin;

        public void eat(){}
        public void sleep(){}
        public void swim(){}

    }

    //공통 특징들 상속받는것들을 Animal로 묶음
    class Animal {
        String eye;
        String mouth;

        public void eat() {}
        public void sleep() {}

    }

    class Eagle2 extends Animal {
        String wing;
        public void fly(){}

    }

    class Tiger2 extends  Animal{
        String leg;
        public void run(){}
    }

    class Goldfish2 extends Animal{
        String fin;
        public void swim(){}
    }

    class Student{
    


    }