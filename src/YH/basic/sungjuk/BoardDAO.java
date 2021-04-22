package YH.basic.sungjuk;

import java.util.List;

public interface BoardDAO {

    int insertBoard(BoardVO bd);
    List<BoardVO> selectBoard();
   BoardVO selectOneBoard(int bdno);
    int updateBoard(BoardVO);
    int deleteBoard(int bdno);

}
