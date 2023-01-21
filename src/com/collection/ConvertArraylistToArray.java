package com.collection;

import java.util.ArrayList;

public class ConvertArraylistToArray {
public static void main(String[] args) {
	ArrayList <Integer>al=new ArrayList<Integer>();
	al.add(20);
	al.add(60);
	al.add(40);
	
	Object []o =al.toArray();
	for(Object s1:o) {
		System.out.println(s1);
	}
}

}
