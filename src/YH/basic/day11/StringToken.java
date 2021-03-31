package YH.basic.day11;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        // StringTokenizer
        // 문자열을 지정한 문자로 쪼개주는 메서드
        // 이렇게 쪼개진 각 문자들을 token이라 부름
        // 단순한 문자열을 빈칸으로 나눌때는 StringTokenizer가 유리
        // 복잡한 문자열을 정규식을 이용해서 나눌때는 split가 유리, split는 콤마로 문자열 구분
        String str = "this string include default delims";

        String word1[] = str.split(" "); //regex : 정규표현식의미  " "이거는 문자마다 한칸씩 띄어쓰기
        for(int i = 0; i < word1.length; ++i)
            System.out.print(word1[i] + " ");
            System.out.println("");

        //StringTokenizer st = new StringTokenizer(str); //단순문자 나눔
        // 기본구분자에 의해 문자열을 적절히 쪼갬
            StringTokenizer st = new StringTokenizer(str, " "); //복잡한 문자 나눌때 사용
        // 지정한 구분자로 문자열을 적절히 쪼갬
        
        
        System.out.println(st.countTokens()); // 결과5는 5칸을 띄어썻다는 의미
        while(st.hasMoreTokens()){ //처리할 토큰있는지 확인 절차
            System.out.print(st.nextToken() + " ");
        }
        // StringTokenizer는 iterable 자료구조임
        // 즉, 배열의 세련된 객체형식이라 보면 됨 (컬렉션)
        // 따라서, 분리된 토큰들은 차례때로 하나씩 순회해가면서
        // 처리할 수 있음
        
        System.out.println("");
    }

}
