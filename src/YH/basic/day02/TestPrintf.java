package YH.basic.day02;

public class TestPrintf {
    public static void main(String[] args) {
    	
    int x = 5;
    double pi = 3.14;
    
    
    // 4개의 출력문을 사용해서 메세지 출력
    System.out.print("x = ");
    System.out.print(x);
    
    
    System.out.print(" and pi = ");
    System.out.println(pi);
    
    // + 연산자를 이용해서 2개의 출력문을 사용
    System.out.print("x = " + x);
    System.out.println(" and pi = " + pi);
    
    // printf 메서드를 이용해서 1개의 출력문을 사용
    // 형식지정자 : 특정 문자열 내에 출력할 대상과 모양을 
    // 지정하는데 사용되는 특수한 문자
    
    
    // %d : decimal, 정수를 표기할때 사용
    // %f : float, 실수를 표기할때 사용
    // %c : character, 문자 하나를 표기할때 사용
    // %s : string, 문자열을 표기할때 사용
    
    
    
    System.out.printf(
    	   "x = %d and pi = %f  \n", x, pi);
    
    String fmt = "x = %d and pi = %f  \n";
    System.out.printf( fmt, x, pi);
    
    
    
    // 출력
    
    
 
    //총점, 평균 처리
	name = "홍길동";
	kor = 95;
	eng = 80;
	mat = 90;
    
	tot = kor + eng + mat;
    avg = tot / 3;
    grd = '가';
    // 이름 : 홍길동, 국어 : , 영어:   , 수학:  
    // 총점 :       , 평균 : , 학점:  
     
     String fmt = "x = %d and pi = %f  \n";
     System.out.printf( fmt, x, pi);
 
     System.out.print(" and pi = ");
     System.out.println(pi);
     
     // + 연산자를 이용해서 2개의 출력문을 사용
     System.out.print("x = " + x);
     System.out.println(" and pi = " + pi);
     

		String fmt =
				" 이름: %s, 국어: %d, 영어: %d, 수학: %d\n";
		System.out.printf(fmt, name, kor, eng, mat);
		
		fmt = "총점: %d, 평균: %.1f, 학점: %c";

		System.out.printf(fmt, tot, avg, grd);
	              
    }
	
	
}
