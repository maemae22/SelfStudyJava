package ch13_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로, 점수를 값으로 저장하기
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // "홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t 홍길동 : " + map.get("홍길동") +"\n");

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t"+key+" : "+value);
        }

        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String , Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t"+key+ " : " + value);
        }
        System.out.println();

        map.clear(); // 객체 전체 삭제
        System.out.println("총 Entry 수 : " + map.size());

    }
}
