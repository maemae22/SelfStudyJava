package ch13;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // name과 age 값이 같으면 true를 리턴
    @Override
    public boolean equals(Object o) {
        if(o instanceof Member) {
            Member member = (Member) o;
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }
    }

    // name과 age 값이 같으면 동일한 hashCode를 리턴
    @Override
    public int hashCode() {
        return name.hashCode() + age;  // String의 hashCode() 이용
    }
}
