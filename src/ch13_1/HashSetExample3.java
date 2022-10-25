package ch13_1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<Student2> set = new HashSet<>();

        set.add(new Student2(1, "홍길동"));
        set.add(new Student2(2, "신용권"));
        set.add(new Student2(1, "조민우")); // 학번(해시코드)이 같으므로, 저장되지 않음.

        for (Student2 student2 : set) {
            System.out.println(student2.studentNum + " : " + student2.name);
        }
    }
}
