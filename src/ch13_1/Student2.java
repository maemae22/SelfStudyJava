package ch13_1;

import java.util.Objects;

public class Student2 {
    public int studentNum;
    public String name;

    public Student2(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student2) {
            Student2 student2 = (Student2) o ;
            return (student2.studentNum == studentNum) ;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
