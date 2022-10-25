package ch13_1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수를 받은 아이디 저장
        int maxScore = 0 ; // 최고 점수 저장
        int totalScore = 0; // 점수 합계 저장

        // 문제 풀이
        for (String key : map.keySet()) {
            totalScore += map.get(key);
            if(map.get(key)>maxScore) {
                maxScore = map.get(key);
                name = key;
            }
        }

        System.out.println("평균점수 : " + totalScore/map.size());
        System.out.println("최고점수 : " + maxScore);
        System.out.println("최고점수를 받은 아이디 : " + name);

    }
}
