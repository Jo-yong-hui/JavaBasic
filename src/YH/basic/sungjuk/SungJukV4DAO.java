package YH.basic.sungjuk;

import java.util.List;

public interface SungJukV4DAO {

    //DAO 기본뼈대 5가지
    int insertSungJuk(SungJukVO sj);
    List<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungJuk(int sjno);
    int updateSungJuk(SungJukVO sj);
    int deleteSungJuk(int sjno);

}
