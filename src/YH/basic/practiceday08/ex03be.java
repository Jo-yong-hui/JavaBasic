package YH.basic.practiceday08;

public class ex03be {
    public static void main(String[] args) {
        //배열함수를 쓸때 []를 이용한다.

        //char함수는 character 함수로 특정기호를 숫자에 맞게 출력하는 문자열함수
//        char[] letter;
//        letter = new char[3];
//        letter[0] = 'a';
//        letter[1] = 'b';
//        letter[2] = 'c';
//
//        //여기서 콤마는 말그대로 콤마를 붙여서 구별해주기
//        for (int i = 0; i < 3; ++i) {
//            System.out.print(letter[i] + ",");
//        }
//
//        double[] a = {1.1, 2.2, 3.3};
//        System.out.println(a[0] + " " + a[1] + " " + a[2]);
//
//        a[1] = a[2];
//        System.out.println(a[0] + " " + a[1] + " " + a[2]);
//
//        int[] sampleArray = new int[10];
//        for (int idx = 1; idx < sampleArray.length; ++idx)
//            sampleArray[idx] = 3 * idx;
//
//        System.out.println(""); // 줄바꿈표시

        //배열에 정의하고 갑 저장하기1
        //int[] num1 = new int[10];
//        num1[0] = 1;
//        num1[1] = 2;
//        num1[2] = 3;
//        num1[3] = 4;
//        num1[4] = 5;
//        num1[5] = 6;
//        num1[6] = 7;
//        num1[7] = 8;
//        num1[8] = 9;
//        num1[9] = 10;
//
//        System.out.println(num1[0]);
//        System.out.println(num1[1]);
//        System.out.println(num1[2]);
//        System.out.println(num1[3]);
//        System.out.println(num1[4]);
//        System.out.println(num1[5]);
//        System.out.println(num1[6]);
//        System.out.println(num1[7]);
//        System.out.println(num1[8]);
//        System.out.println(num1[9]);
//
//        for (int i = 0; i < num1.length; ++i) {
//            num1[i] = i + 1;
//        }
//
//            int[] num2 = new int[11];
//
//            for(int i = 0; i < num2.length; ++i){
//                num2[i] = i * 2;
//                System.out.print(num2[i] + ",");
//            }
//        System.out.println("");

        int[] num6 ={ 0, 11, 2, 33, 4, 55, 6, 77, 8, 99};
        for (int i = 0; i < num6.length; ++i){
            System.out.print(num6[i] + ",");
        }
        System.out.println(" ");//줄바꿈 표시

        // for (int i = 0; i < num6.length; ++i){
        // System.out.print(num6[num6.length-1-i] + ",");
        // num6.length에 10부터 대입하면 9-0 = 인덱스 9번쨰 부터 출력, ++i니까 순서대로 출력나옴
        // }
        //  인덱스를 증가시키면서 배열 역순으로 출력

        for (int i = (num6.length - 1); i >= 0; --i){
            System.out.print(num6[i] + ",");
        }

        }
    }
