package com.onetoonebidirectionalmapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(10);
	
	
	  System.out.println(li.stream().distinct().collect(Collectors.toList()));
}
}
