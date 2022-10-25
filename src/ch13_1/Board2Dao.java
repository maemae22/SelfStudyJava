package ch13_1;

import java.util.ArrayList;
import java.util.List;

public class Board2Dao {
    public List<Board2> getBoardList() {
        List<Board2> list = new ArrayList<>();
        list.add(new Board2("제목1", "내용1"));
        list.add(new Board2("제목2", "내용2"));
        list.add(new Board2("제목3", "내용3"));

        return list;
    }
}
