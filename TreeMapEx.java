package com.review;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "abhi");
		tm.put(2, "kanojia");
		tm.put(3, "Abhishek");
		tm.put(10, null);
		tm.put(4, "kumar");
		
		System.out.println(tm);
		
		tm.remove("kumar");
		System.out.println(tm);
		
	}
}
