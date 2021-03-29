package YH.basic.day10;

public class Starcraft2 {
        //인터페이스 기반으로 스타크래프트의 유닛을 정의해 봄
    public static void main(String[] args) {
        SCV2 s = new SCV2();
        s.attack();
        s.move();
        s.specialAbility();
        System.out.println( "SCV의 체력" + s.hp);

        Marine2 m = new Marine2();
        m.attack();
        m.move();
        m.specialAbility();
        System.out.println( "해병 체력" + m.hp);

      Firebat2 f = new Firebat2();
        f.attack();
        f.move();
        f.specialAbility();
        System.out.println( "파이어벳 체력" + f.hp);
    }

}

abstract class Unit2{
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;//speed 쓴것
    protected int mineral;
    protected int gas;

    public Unit2(){}

    //주석처리하기
    // public Unit(String name, int hp, int power,
    //             double mvspd, int mineral, int gas) {
    //    this.name = name;
    //   this.hp = hp;
    //  this.power = power;
    // this.mvspd = mvspd;
    // this.mineral = mineral;
    //  this.gas = gas;
    //  }

    // abstract public void attack();
    // abstract public void move();
    // abstract public void specialAbility();

}

// 추상클래스에서 정의했던 추상메서드를 
// 독립적인 코드들로 분리함 -> 인터페이스
interface Unit2Action {
    abstract public void attack();
     void move();           //abstract public 생략 가능
     void specialAbility();
}



//위에 abstract public~가 불완전해서 빨간줄표시 보이는거다.
//메서드 구현으로 불완전 코드를 완전한 코드로 구현
class SCV2 extends Unit2 implements Unit2Action {
    
    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "대상을 수리하는 중입니다\n"; //

    public SCV2() {
        name = "SCV";
        hp = 45;
        power = 0;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }


    //알트 앤터로 메서드 구현 하면 밑에 나옴
    @Override
    public void attack() {
        // sout("융합절단기를 이용해서...")
        // 추상메서드를 이용해서 부모클래스에 정의된
        //attack메서드를 유닛에 맞게 재정의함
        System.out.printf(fmtattack, power);
    }
    @Override
    public void move() { System.out.printf(fmtmove, mvspd); }

    @Override
    public void specialAbility() { System.out.printf(fmtspabty); }
}

class Marine2 extends Unit2 implements Unit2Action{
    final String fmtattack = " 가우스소총을 이용해서 대상에 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%%증가, 공격속도 33%% 증가합니다\n";

    public Marine2(){
        name ="해병대";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }

    //unit2위에 attack, move 등 주석처리해버려서 없어진걸로 처리되서 빨간줄로 표시된거임
    //implements Unit2Action 함으로써 메서드 내려받아서 빨간줄 사라짐
    @Override
    public void attack() { System.out.printf(fmtattack, power); }

    @Override
    public void move() { System.out.printf(fmtmove, mvspd); }

    @Override
    public void specialAbility() { System.out.printf(fmtspabty); }
}

class Firebat2 extends Unit2 implements Unit2Action {

    final String fmtattack = " 화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%%증가, 공격속도 33%% 증가합니다\n";


    public Firebat2() {

        name = "화염방사병";
        hp = 50;
        power = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}




