package com.ccreview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapCode {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("a",20);
        map.put("b",30);
        map.put("c",40);
        map.put("d",null);
        System.out.println(map.get("c"));
        }
    }

