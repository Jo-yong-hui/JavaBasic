package YH.basic.sungjuk;

import java.io.Serializable;

// 직렬화를 지원하기 위해 Serializable 구현해서 정의해야 함!
// 직렬화 대상 객체(SungJukVO)에다가 implements Serializable 붙여줘야함
public class SungJukVO implements Serializable {
    // 데이터 값만 쓴것

    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected char grd;

    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }




        public void setName (String name){
            this.name = name;
        }

        public String getName () {
            return name;
        }

        public int getKor () {
            return kor;
        }

        public void setKor ( int kor){
            this.kor = kor;
        }

        public int getEng () {
            return eng;
        }

        public void setEng ( int eng){
            this.eng = eng;
        }

        public int getMat () {
            return mat;
        }

        public void setMat ( int mat){
            this.mat = mat;
        }

        public int getTot () {
            return tot;
        }

        public void setTot ( int tot){
            this.tot = tot;
        }

        public double getAvg () {
            return avg;
        }

        public void setAvg ( double avg){
            this.avg = avg;
        }

        public char getGrd () {
            return grd;
        }

        public void setGrd ( char grd){ this.grd = grd; }

        //String.format 형식을 result 변수에 담아서 다음에 또 쓸 수 있다.
    @Override
    public String toString() {
        String fmt = "{name: '%s', kor: %d, eng: %d , mat:%d" +
                " tot: %d, avg: %.1f, grd:'%s'}";
        String result = String.format(
                fmt,name, kor, eng,mat,tot,avg,grd);
        return result;
    }
}






