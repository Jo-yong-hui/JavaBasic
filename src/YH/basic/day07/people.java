package YH.basic.day07;

public class people {
    public static void main(String[] args) {
        //객체지향 프로그래밍 개요
        // 모든 데이터를 객체로 취급하여 소프트웨어를 개발함
        // 객체 : 실생활에서 우리가 인식하는 유/무형의 사물
        // ex) 집, 자동차, 사람, 급여, 주문, 사랑, ...

        // 클래스 : 객체를 만들어 내는 틀, 설계도
        // 클래스에는 객체의 상태를 나타내는 필드/속성과
        // 객체의 기능을 나타내는 메서드로 구성
        
        // 클래스는 객체의 설계도이기 때문에
        // 실제 정보를 저장할 수 없음
        // 실제 정보를 저장하려면, 이것의 객체화가 필요한데
        // 객체를 선언하는 과정을 개체화라고 함
        // 객체화를 통해 나온 결과물을 객체/인스턴스라 하는데
        // 클래스에 정의된 필드와 기능이 실제 메모리상에 할당된 것임

        // 하나의 클래스로 부터 여러개의 객체를 생성할 수 있음
        // 이렇게 생성된 객체는 독립된 메모리 공간에 저장된
        // 자신만의 변수를 가질수 있음.

        // 일반적인 클래스 구성요소
        // 멤버변수, 생성자, setter/getter

        // 고객정보
        // 이름, 직업, 나이, 성별, 혈액형
        // 밥 먹기, 잠자기, 말하기, 걷기

        // 고객정보를 기존방식으로 정의
        // 속성별로 변수를 각각 선언해야함 - 관리가 번거로울 수 있음
        String name;
        String job;
        int age;
        String gender;
        String blood;

        // 변수 초기화
        name = "최승희";
        job = "의사";
        age = 45;
        gender = "여";
        blood = "A";

        // 클래스 사용하기
        // 1. 클래스에 대한 객체화 필요
        // 2. 클래스를 구성하는 변수들이 메모리에 할당되어야 사용가능
        //p변수를 객체변수이며, 인스턴스 변수라고도 한다.
        Person p = new Person();
        
        // 2. 클래스 멤버변수 초기화
        p.name = "이미녀";
        p.job = "의사";
        p.age = 28;
        p.gender = "여";
        p.blood = "O";
        
        // 학생 클래스 사용하기
        Student s = new Student();
        s.hakbun= 201350050;
        s.name = "김태희";
        s.addr = "경기도 고양시";
        s.birth = "1985.3.22";
        s.dname = "컴퓨터";
        s.prof = "504";
        
        //생성자를 이용해서 클래스 사용하기
        Person p2 =  new Person("김이남","교수",47,"남","AB");
        Student s2 = new Student("201250006", "송혜교","서울영등포구","컴퓨터",201350050,"1985.3.22");

                //객체에 대입한 값출력하기
                // 출력시 객체명.멤버변수명
        System.out.println(p2.name);
        System.out.println(p2.job);
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println(p2.blood);

    }

    // 고객 클래스
    static class Person {
        // 변수선언(속성property, 필드field, 멤버member)
        private String name;
        private String job;
        private int age;
        private String gender;
        private String blood;

        // 생성자 : 변수초기화 관련 특수한 메서드
        // 기본생성자, 매개변수를 포함하는 생성자
        
        // 기본생성자 : 컴파일러가 자동으로 생성해서 추가해 줌
        // public 클래스명(매개변수){
        // 초기화 코드
        //}
        public Person(){}


        //매개변수를 포함하는 생성자
        // public 클래스명(매개변수){
        // 초기화 코드
        //}
        // 생성자의 매개변수명과 멤버변수명이 일치하면
        // 일반적으로 shadowing 현상이 발생
        // 클래스의 멤버변수임을 명확하게 표현하기 위해
        // this라는 키워드를 추가함
        public Person(String name, String job, int age,
                      String gender, String blood){
           this.name = name;
           this.job = job;
           this.age = age;
           this.gender = gender;
           this.blood = blood;

        }
    }

    // 학생클래스
     static class Student{
        private int hakbun = 201350050;
        private String name = "김태희";
        private String addr = "경기도고양시";
        private String birth = "1985.3.2";
        private String prof = "1988.9.17";
        private String dname = "컴퓨터";
        //매개변수를 생성한 학생클래스
        public Student(){}

         public Student(String name, String addr, String birth
                     , String prof, int hakbun, String dname ){
             this.name = name;
             this.addr = addr;
             this.birth = birth;
             this.prof = prof;
             this.hakbun = hakbun;
             this.dname = dname;
         }


        }



    }


