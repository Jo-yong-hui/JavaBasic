package YH.basic.day09;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;


//일반폰 : //전화걸기, 전화받기
public class Phones {
    public static void main(String[] args) {
        //한번에 모아서 메서드 출력함
        Normalphone n = new Normalphone();
        n.sendCall();

        MP3Phone m = new MP3Phone();
        m.playmusic();

        SmartPhone s = new SmartPhone();
        s.takePic();

     }
  }




//MP폰
// : 전화걸기, 전화받기, 음악재생, 동영상보기
interface MP3Interface{
    void playmusic();
    void viewMovie();
}

interface PhoneInterface{
    void sendCall();
    void receiveCall();

}


//스마트폰    // : 전화걸기, 전화받기, 사진찍기, 인터넷, 게임
interface  SmartphoneInterface{
    void takePic();
    void surfInternet();
    void playgame();
}

class SmartPhone implements PhoneInterface,  SmartphoneInterface{

    @Override
    public void sendCall() {

    }

    @Override
    public void receiveCall() {

    }

    @Override
    public void takePic() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다");
    }

    @Override
    public void playgame() {
        System.out.println("게임을 합니다");
    }
}


    class Normalphone implements PhoneInterface {
        protected String calling;
        protected String answerd;

        @Override
        public void sendCall() {
            System.out.println("전화 거는 중...");
        }

        @Override
        public void receiveCall() {
            System.out.println("전화 받는 중...");
        }
    }

    class MP3Phone implements PhoneInterface, MP3Interface{

        @Override
        public void sendCall() { }

        @Override
        public void receiveCall() { }

        @Override
        public void playmusic() {
            System.out.println("음악즐 재생합니다");
        }

        @Override
        public void viewMovie() {
            System.out.println("동영상을 재생합니다");
        }
    }

//상속은 부모클래스가 가진 특성과 기능을 변화없이 받아옴
//구현(implements) : 부모클래스가 정해준 틀에 맞춰 새롭게 작성. 인터페이스는 내용틀만 가져오고 그걸 토대로 새로운거만든다.
// 따라서, 아래처럼 짜는 것은 다소 세련되지 못함
    class MP3Phone2 extends Normalphone implements MP3Interface{

        @Override
        public void playmusic() { }

        @Override
        public void viewMovie() { }
    }











