package com.xiang.demo.java.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		Comparator<Apple> byColor = new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		
		List<Apple> list = Collections.emptyList();
		list.sort(byColor);
		
/*		Comparator<Apple> byColor2 = (o1, o2) -> 
			o1.getColor().compareTo(o2.getColor());*/
		Comparator<Apple> byColor2 = (o1, o2) -> {				
			return o1.getColor().compareTo(o2.getColor());
		};
		
		Function<String, Integer> stringConsumer = s -> s.length();
		System.out.println(stringConsumer.toString());
		
		Predicate<Apple> p = (Apple a) -> {
			return a.getColor().equals("green");
		};
		
		
		Runnable r = () -> {
			System.out.println(1);
		};
		
		
	}
	
}
