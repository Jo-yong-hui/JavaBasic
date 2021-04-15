package YH.basic.practiceday08;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class jCalen {
    public static void main(String[] args) {
/*
	/*
		 String 클래스의 toString은
		 String 인스턴스가 갖고 있는 문자열을 반환하도록 오버라이딩 되어있음

		 Date 클래스의 toString은
		 Date 인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어있음
		 */


        //Date는 날짜
        Date d = new Date();
        System.out.println(d.toString());

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
        System.out.printf(fmt,d.getYear() + 1999,d.getMonth() + 1
        ,d.getDate(),d.getHours(),d.getMinutes(),d.getSeconds() );




        /*
        printf 함수는 일반적으로 몇 가지 프로그래밍 언어와 연결된 함수의 일종이다.
        다양한 자료형 변수를 문자열로 변환하는 방식을 지정해주는 형식 문자열(format string)인 문자열 변수를 받아들인다.
        이 문자열은 기본적으로 표준 출력 시스템에 인쇄된다.
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.printf(fmt,c.get(Calendar.YEAR),c.get(Calendar.MONTH) +1,c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)  );

        System.out.println( " 오늘은 " + c.get(Calendar.DAY_OF_WEEK) + "요일 입니다");

        // 일요일 : 1 월요일 : 2, ...., 토요일 : 7

        System.out.println("오늘은 2021년중 " + c.get(Calendar.DAY_OF_YEAR) + "일째 날입니다");

        // 오늘 기준 5일 후 날짜는? (add 메서드 이용)
        c.add(Calendar.DATE,5);
        System.out.println(c.getTime());

        // 오늘부터 100일은 언제?

        /*
        getTime() 메서드는 표준시에 따라 지정된 날짜의 시간에 해당하는 숫자 값을 반환합니다.
        이 메서드를 사용하면 다른 Date 객체에 날짜와 시간을 지정할 수 있습니다.
         이 메소드는 기능적으로 valueOf() 메소드와 동일합니다.
         */

        //calendat  객체생성
        c = Calendar.getInstance();
        c.add(Calendar.DATE, 100);
        System.out.println(c.getTime());

        c = Calendar.getInstance();
        c.add(Calendar.DATE,-11-4);
        System.out.println(c.getTime());

        c = Calendar.getInstance();
        c.add(Calendar.MONTH,10);
        System.out.println(c.getTime());

        // SimpleDateFormat
        // 날짜 출력을 원하는 형태대로 다양하게 출력
        fmt = " yyyy-MM-dd HH:mm:ss";
        //date를 SimpleDateFormat방식대로 출력
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(d));
        //Calendar를 SimpleDateFormat방식대로 출력

        c = Calendar.getInstance();
        System.out.println(sdf.format(c.getTime()));


        // JDK8에서 추가된 jodatime 사용하기
        // Java.time 패키지
        // 날짜를 표현할 떄는 LocalDate
        // 시간을 표현할 떄는 LocalTime
        // 날짜, 시간 같이 둘다 표현할 떄는 LocalDateTime

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);

    }
}
