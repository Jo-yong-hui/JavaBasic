package YH.basic.day10;



public class Static {
    public static void main(String[] args) {
        // 클래스 변수
        // 클래스 내에 선언된 변수
        // 개별적이고 독립적인 값이 생성되고 저장되는 인스턴스변수와는 달리
        // 한번 값이 생성되어 저장되면 모든 영역에서 값을 공유하는 변수
        // 객체마다 값을 개별적으로 관리해야 할 필요가 없고
        // 공유해서 사용하고 싶을때 씀
        // static 이라는 키워드로 선언해야 함
        // 클래스변수는 객체의 생성 과정없이 바로 사용가능
        // 또한, 클래스가 메모리에 적재될때 미리 생성됨
        // 호출방법은 '클래스명.변수명'을 사용함
        // 교실 공용프린터 : 클래스. 교실안에 각자 개개인이 사용하는 컴퓨터가 인스턴스
        // 보통, 인스턴스변수를 하나만 생성되도록 제한해서 사용하는 것을 추천!
        // 디자인 패턴 중 singleton 패턴 사용

        // main 메서드의 비밀

        //m1과 m2는 남남 변수 하지만 allofmember 로 하나가됨
        // m1과 m2중 같은 숫자를 공유하며 둘중하나 숫자바꾸면 같이 바뀐다.
        //기존의 인스턴스 변수랑 약간다름 //인스턴스변수를 static으로 쓴것




        Member m1 = new Member();
        m1.userid = "혜교";
        m1.passwd = "abc123";
       // Member.allOfMember = 1;  //클래스 변수 호출  //이방식 아래방식 같음
        m1.allOfMember = 1;

        System.out.println(m1.userid + "/" + m1.passwd + "/" );
        System.out.println(Member.allOfMember + "/" + m1.allOfMember );


        Member m2 = new Member();
        m2.userid = "지현";
        m2.passwd = "987xyz";
       // Member.allOfMember = 2; //이방식 아래방식같음
        m2.allOfMember = 2;

        System.out.println(m2.userid + "/" + m2.passwd + "/" );
        System.out.println (Member.allOfMember + "/" + m2.allOfMember);
        System.out.println("m1의 allOfMember :  " + m1.allOfMember);
        //m1의 allOfMember와 m2의 allOfMember는 같은 변수를 참조함.
        // 그래서 결국 m1과 m2값이 같게 1/1 2/2나옴 같은공에서 만들어진변수라서
        //어떤 객체든 같은 변수를 공유한다.
        
    }
    
}

class  Member{
    static int allOfMember; // 같은변수를 공유하는 클래스변수

    String userid;          //인스턴스 변수
    String passwd;
}