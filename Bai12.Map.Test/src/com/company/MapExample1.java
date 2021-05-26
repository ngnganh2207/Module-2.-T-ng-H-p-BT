package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {
    public static void main(String[] args) {
        //init map
        Map<Integer, String> map= new HashMap<Integer, String>();
        map.put(100, "AA");
        map.put(101, "BB");
        map.put(102, "CC");
        //show map
        Set<Integer> set=map.keySet();
        for (Integer a:
             set) {
            System.out.println(a+ " "+ map.get(a));
            
        }
    }
}
