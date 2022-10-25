package ch13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
        List<String> list = new ArrayList<>(); // 생략해도 됨

        list.add("Java"); // String 객체를 저장
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size(); // 저장된 총 객체 수 얻기
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        String skill = list.get(2); // 2번 인덱스의 객체 얻기
        System.out.println("2 : " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
            String str = list.get(i);
            System.out.println(i+ " : " + str);
        }
        System.out.println();

        list.remove(2); // Database 삭제
        list.remove(2); // Servlet/JSP 삭제
        list.remove("iBATIS");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
