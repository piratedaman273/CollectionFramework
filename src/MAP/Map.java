package MAP;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(23,"Aman");
        hashMap.put(24,"John Doe");
        System.out.println(hashMap.getOrDefault(23,"No value Present"));
        System.out.println(hashMap.getOrDefault(24,"No value Present"));
        System.out.println(hashMap.getOrDefault(25,"No value Present"));

        //TC  ==== O(logn) to retrieve after java 8
    }
}
