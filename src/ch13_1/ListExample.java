package ch13_1;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Board2Dao dao = new Board2Dao();

        List<Board2> list = dao.getBoardList();

        for (Board2 board: list) {
            System.out.println(board.getTitle()+"-"+board.getContent());
        }
    }
}
