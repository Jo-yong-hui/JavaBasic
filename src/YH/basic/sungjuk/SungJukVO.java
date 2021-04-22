package YH.basic.sungjuk;

import java.io.Serializable;

// 직렬화를 지원하기 위해 Serializable 구현해서 정의해야 함!
// 직렬화 대상 객체(SungJukVO)에다가 implements Serializable 붙여줘야함
public class SungJukVO implements Serializable {
    // 데이터 값만 쓴것

    protected String sjno; //여기서 sjno는 문자로 한 것  // 열1   %s
    protected String name; //열 순서 이거그대로    / 열2        %s
    protected int kor; //3   %d
    protected int eng; //4   %d
    protected int mat; //5  %d
    protected int tot; //6 %d
    protected double avg; //7 %.1f
    protected char grd; //8 %s
    protected String regdate; //9  %s

    public String getSjno() {
        return sjno;
    }

    public void setSjno(String sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

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






