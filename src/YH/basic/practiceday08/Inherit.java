package YH.basic.practiceday08;

public class Inherit {

    public static void main(String[] args) {

    }
}

class Eagle{
    //필드(멤버변수)
    String eye;
    int mouth;
    int wing;
    
    //메서드
    public void eat(){}
    public void sleep(){}
    public void fly(){}

}

class Tiger{

    String eye;
    String mouth;
    String leg;

    public void eat(){}
    public void sleep(){}
    public void run(){}

}

class Goldfish{

    String eye;
    String mouth;
    String fin;

    public void eat(){}
    public void sleep(){}
    public void swim(){}

}


//공통 특징들 상속받는것들을 Animal로 묶음
class Animal{
    String eye;
    String mouth;

    public void eat(){}
    public void sleep(){}

}

class Eagle2 extends Animal{
    String leg;
    public void run(){}
}


class Tiger2 extends Animal{
    String leg;
    public void fly(){}
}


class Goldfish2 extends Animal{
    String leg;
    public void swim(){}
}




