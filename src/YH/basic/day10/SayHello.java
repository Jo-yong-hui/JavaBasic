package YH.basic.day10;

public class SayHello {
    //다국어(한글, 영어, 일본어)로 인사하는 프로그램 작성
    public static void main(String[] args) {
        //정적바인딩 형식
            SayHellokor say1 = new SayHellokor();
            say1.sayHello();

            SayHelloEng say2 = new SayHelloEng();
            say2.sayHello();

            SayHelloJpn say3 = new SayHelloJpn();
            say3.sayHello();

            //  다형성을 이용해서 인삿말을 세련되게 하기
            // SayHelloService부모타입으로 kor,eng jpn 한번에 담음

                SayHelloService say = new SayHellokor(); //say는 kor타입, 이게바로 정적타입
                say.sayHello();

                say = new SayHelloEng(); //say는 eng타입
                say.sayHello();

                say = new SayHelloJpn(); //say는 jpn타입
                say.sayHello();

    }
}

interface SayHelloService{
    void sayHello();
}

class SayHellokor implements SayHelloService {
    @Override
    public void sayHello(){
        System.out.println("안녕하세요, 자바8!");

    }

}

class SayHelloEng implements SayHelloService{
    @Override
    public void sayHello(){
        System.out.println("Hello, Java8!!");

    }

}

class SayHelloJpn implements SayHelloService {
    @Override
    public void sayHello(){
        System.out.println("こんにちは, ジャワ8!!");

    }

}

// 왼쪽 프로젝트 파일 모음집 안에 rt.jar들어가면 평소에사용하는 패키지가 다 들어있다. util 안에는 Scanner있음