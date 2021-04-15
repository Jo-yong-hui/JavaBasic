package YH.basic.practiceday08;

public class Overloading2 {
    public static void main(String[] args) {


        NonOver2 no = new NonOver2();
        System.out.println(no.add_int(10,20));
        System.out.println(no.add_int3(10,20,30));
        System.out.println(no.add_double(0.8,0.9));

        Over2 ov = new Over2();
        System.out.println(ov.add(30,40));
        System.out.println(ov.add(300,  500,600));
        System.out.println(ov.add(0.8,0.9));

    }
}

class NonOver2{
    // 1. 정수 2개를 이용한 덧셈 메서드
    public int add_int(int a, int b){ return a + b;}
    // 2. 정수 3개를 이용한 덧셈 메서드
    public int add_int3(int a, int b, int c){return a + b + c;}
    // 3. 실수 2개를 이용한 덧셈 메서드
    public double add_double(double a, double b){

        return a + b;

    }

}

class Over2{

    public int add(int a, int b){return  a + b ;}

    public int add(int a, int b, int c){return a + b + c;}

    public double add(double a, double b){ return a + b;}

}




