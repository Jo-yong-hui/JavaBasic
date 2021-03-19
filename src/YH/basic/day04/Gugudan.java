package YH.basic.day04;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1
		System.out.println("7 * 1 = 7");
		System.out.println("7 * 2 = 14");
		System.out.println("7 * 3 = 21");
		System.out.println("7 * 4 = 28");
		System.out.println("7 * 5 = 35");
		System.out.println("7 * 6 = 42");
		System.out.println("7 * 7 = 49");
		System.out.println("7 * 8 = 56");
		System.out.println("7 * 9 = 63");
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세요 v1 - for문
		for(int i = 1; i <= 9; ++i ) {
		System.out.println(
				"7 * " + i + " = " + (7*i));
		}
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세요 v3 - while문 printf
		String fmt = " 7 * %d = %d \n";
		int i = 1;
		while(i <= 9) {
	    System.out.printf(fmt, i, 7*i);
		++i;
	
		}
		System.out.println("----- -----");
		
		//ex) 3단을 출력하세요 - while, printf
		
	    String fmt1 = " 3 * %d = %2d \n"; 
	    //%d이지만 %2d처럼 2를 넣어주면 한자리수와 두자리수 정렬해준다
	    i = 1;
	    while(i <= 9) {
	    System.out.printf(fmt1, i, 3*i);
	    ++i;
	    	
	    }
	    System.out.println("----- -----");
	    
	    // 구구단 프로그램 v1
	    // 사용자로부터 숫자( 1 - 9)를 하나 입력 받아,
	    // 구구단을 출력하는 프로그램 작성
	    // Scanner, while, printf
	   
	    Scanner sc = new Scanner(System.in);
	    System.out.print("출력할 구구단의 단을 입력하세요 : ");
	    int dan = sc.nextInt();
	    
	    i = 1;
	    fmt = "%d * %d = %2d\n";
	    while(i <=9) {
	    System.out.printf(fmt,dan,i,(i*dan));
	    	++i;
	    }

	    //구구단 프로그램v2
	    //단, 1 - 9 이외의 숫자나 문자를 입력 받으면 
	    // "잘못 입력하셨습니다!!"라는 메시지를 출력하도록 합니다.
	    
	    System.out.print("출력할 구구단의 단을 입력하세요 : ");
	    char dan2 = sc.next().charAt(0);
	    // 입력받은 문자열 중 첫번째 글자만 뽑아서
	    // chart형 변수에 대입
	    // 입력받은 문자의 ASCII 코드값이 49~57인지 검사
	    //첫번쨰 구구단은 숫자입력하면 정상적으로 구구단 나온다.
	    
	    
	    String result =
	    		(dan2 >=49 && dan2 <= 57) ? "구구단출력" : "잘못입력하셨습니다";
	    
	    System.out.println(result);
	    //구구단이 두개 실행되기 때문에 ' 첫번쨰 구구단의 입력하세요 :' 칸에 숫자입력하면 정상적으로 숫자나온다
	    //두번쨰 구구단 문구는 문자를 입력했을때 "잘못입력하셨습니다" 문구가 나오는 구조이다.
	    
	    
	    System.out.print("출력할 구구단의 단을 입력하세요 : ");
	    String dan3 = sc.next();
	    
	    i = 1;	    
	    try {
	    	while(i <=9) {
	    		System.out.printf(
	    				fmt,dan3,i,
	    				(Integer.parseInt(dan3)*i));
	    	++i;
	      }
	    } catch(Exception ex) {
	    	System.out.println("잘못입력하셨습니다!");
	    }
	     // 예외처리코드(try-catch)를 이용해서 
	     // 프로그램 실행중 오류발생시 
	     // 제어를 catch 코드쪽으로 넘김
	      
	     // ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성하세요    
	     // 주민번호 123456-7654321에서 7이 성별을 나타내는 코드
	     // 1: 1999년 이전에 출생한 남자
	     // 2: 1999년 이전애 출생한 여자
	     // 3: 2000년 이후에 출생한 남자
	     // 4: 2000년 이후애 출생한 여자
	     // charAt를 이용해서 풀어보세요 
  	    String jumin = "123456-2234567"; //0부터 숫자를 센다.0,1,2,3,4,5,6,7쨰칸 순으로 읽는다.
  	    
  	    char gender = jumin.charAt(7);   //보고싶은 자릿수를 charAt에 넣은후 출력하면된다. char gender 변수안에 넣는의미이다.
  	    result = (gender == '1') ? "1999남자" : 
  	    		 (gender == '2') ? "1999여자" :
  	    		 (gender == '3') ? "2000남자" : "2000여자" ;

  	       System.out.println(result);
  	       //출력할 구구단의 단을 입력하세요 : 입력할때 "123456-2234567"; 여기에서 주민번호
  	       //뒷자리중 첫번째자리를 바꿔가며 칸에 입력하면된다.
  }
	  }
		
	


