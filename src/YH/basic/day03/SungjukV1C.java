package YH.basic.day03;

import java.util.Scanner;

/**
*
* @author nickname
* @category javabasic
* @version 1.2
*자바기초프로그램 - 성적처리 프로그램
*
*이름과 성적데이터를 키보드로 직접 입력받아 
*총점, 평균, 학점 처리하고 결과 출력
*
*/
     public class SungjukV1C {
     public static void main(String[] args) {
    	 // 변수선언
    	  String name;              //  이름
    	  int kor;                  //  국어점수
    	  int eng;                  //  영어점수
    	  int mat;                  //  수학점수
    	  int tot;                  //  총점
    	  double avg;               //  평균
    	  char grd;                 //  학점
    	  
    	
    	 // 처리
    	 Scanner sc = new Scanner(System.in);

    	 //키보드를 이용해서 성적데이터를 입력받기 위해
    	 // Scanner  클래스를 초기화함
    	

    	 System.out.print("이름은? ");
    	 name = sc.next();
     	//키보드로 문자데이터를 입력받아 name 변수에 대입
    	
    	 System.out.print("국어는? ");
    	 kor = sc.nextInt();
    	 //키보드로 문자데이터를 입력받아 name 변수에 대입
    	 
    	 System.out.print("영어는? ");
    	 eng = sc.nextInt();
    	 
    	 System.out.print("수학은? ");
    	 mat = sc.nextInt();			

    	 
    	 //총점, 평균, 학점 처리
    		name = "홍길동";
    		kor = 95;
    		eng = 80;
    		mat = 90;
    	    
    		tot = kor + eng + mat;
    	    avg = (double) tot / 3;    	   
    	    grd = (avg >= 90) ? '수' : 
    	    	  (avg >= 80) ? '우' : 
    	    	  (avg >= 70) ? '미' :
    	          (avg >= 60) ? '양' : '가';	  
    	    
    	    
    	
    	 //출력
    	    String	 fmt =
    					" 이름: %s, 국어: %d, 영어: %d, 수학: %d\n";
    			System.out.printf(fmt, name, kor, eng, mat);
    			
    			fmt = "총점: %d, 평균: %.1f, 학점: %c";

    			System.out.printf(fmt, tot, avg, grd);
    			
     }
}