package YH.basic.practiceday08;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.toString());

        String fmt = "%d년 %d월 %d일 %d시 %d분 %d초 \n";
        System.out.printf(fmt, d.getYear() + 1900,d.getMonth() + 1,
                d.getDate(),d.getHours(),d.getMinutes(),d.getSeconds() );
        //더이상 사용하지 말라는 표시뜸


        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime() );

        System.out.printf(fmt, c.get(Calendar.YEAR),
                c.get(Calendar.MONTH)+1,c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),c.get(Calendar.SECOND));


        System.out.println(" 오늘은 " + c.get(Calendar.DAY_OF_WEEK) + " 요일 입니다");
        System.out.println("오늘은 2021년중 " + c.get(Calendar.DAY_OF_YEAR) + "일째 날입니다");

        // 오늘 기준 5일 후 날짜는? (add 메서드 이용)

        c.add(Calendar.DATE,5);
        System.out.println(c.getTime());

        // 오늘부터 100일은 언제?
        c.add(Calendar.DATE,100);
        System.out.println(c.getTime());


        // 질문 왜 11뺴고 4또 뻇는지
        // 오늘부터 11일은 전은??
        c.add(Calendar.DATE,-11 - 4);
        System.out.println(c.getTime());

        //오늘 아내가 아이를 가졌어요, 10개월후는 언제?
        c.add(Calendar.MONTH,10);
        System.out.println(c.getTime());

        // SimpleDateFormat
        // 날짜 출력을 원하는 형태대로 다양하게 출력
        fmt = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        System.out.println(sdf.format(d)); //위에 Date의 d객체 가져온것


        // JDK8에서 추가된 jodatime 사용하기
        // Java.time 패키지
        // 날짜를 표현할 떄는 LocalDate
        // 시간을 표현할 떄는 LocalTime
        // 날짜, 시간 같이 둘다 표현할 떄는 LocalDateTime

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(time);

    }
}
