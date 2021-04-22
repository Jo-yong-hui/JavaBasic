package YH.basic.sungjuk;

public class BoardVO {
    int  bdno;
    String title;
    String userid;
    String regdate;
    int views;
    int thumbup;
    String contents;

    public BoardVO(int bdno, String title, String userid, String regdate, int views, int thumbup, String contents) {
        this.bdno = bdno;
        this.title = title;
        this.userid = userid;
        this.regdate = regdate;
        this.views = views;
        this.thumbup = thumbup;
        this.contents = contents;
    }

    public int getBdno() { return bdno; }

    public void setBdno(int bdno) { this.bdno = bdno; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getUserid() { return userid; }

    public void setUserid(String userid) { this.userid = userid; }

    public String getRegdate() { return regdate; }

    public void setRegdate(String regdate) { this.regdate = regdate; }

    public int getViews() { return views; }

    public void setViews(int views) { this.views = views; }

    public int getThumbup() { return thumbup; }

    public void setThumbup(int thumbup) { this.thumbup = thumbup; }

    public String getContents() {  return contents; }

    public void setContents(String contents) { this.contents = contents; }

    @Override
    public String toString() {
       String fmt = "{ bdno : %d, title: '%s', userid= '%s'," +
               " regdate : '%s', views : %d, thumbup: %d, contents: '%s'";

       String result = String.format(fmt, bdno,title, userid,
               regdate, views, thumbup, contents);
       return  result;
    }
}
