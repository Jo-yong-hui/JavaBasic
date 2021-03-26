package YH.basic.day09;

public class StarCraft2 {
    public static void main(String[] args) {

        SCV s = new SCV();
        System.out.println( "SCV의 체력" + s.hp);
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        m.attack();
        m.move();
        m.specialAbility();
        System.out.println( "해병 체력" + m.hp);

        Firebat f = new Firebat();
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

    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();

}
interface Unit2Action{
    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();

class Scv extends Unit2 implements Unit2Action{

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public void specialAbility() {

    }
}


//위에 abtsract public~가 불완전해서 빨간줄표시 보이는거다.
class SCV extends Unit2{

    //나중에 수정할때 왔다갔다 불편함 제거 위해 한 곳에 모아놓기
    // 여기서 final은 고정시키는 용
    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "대상을 수리하는 중입니다\n";

    public SCV() {
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
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}






class Marine extends Unit2{
    final String fmtattack = " 가우스소총을 이용해서 대상에 %d의 피해를 주고 있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%%증가, 공격속도 33%% 증가합니다n";

    public Marine(){
        name ="해병대";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
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

    interface Unit2Action {
        abstract public void attack();

        abstract public void move();

        abstract public void specialAbility();

        class Marine extends Unit2 implements YH.basic.day09.Unit2Action


        class Firebat extends Unit2 {

            final String fmtattack = " 화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다\n";
            final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
            final String fmtspabty = "전투자극제를 사용해서 이동속도 50%%증가, 공격속도 33%% 증가합니다\n";


            public Firebat() {

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

