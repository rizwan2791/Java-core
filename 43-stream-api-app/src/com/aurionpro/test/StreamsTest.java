package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50);
//		stream.forEach(n -> System.out.println(n));
//		Stream<String> stream1 = Stream.of("Rizwan", "Sarah");
//		stream1.forEach(n -> System.out.println(n));
		List<String> players = Arrays.asList("a", "b", "c", "d");
//		players.stream().forEach(n -> System.out.println(n));
//		Stream<String> s = Stream.generate(() -> "sometest").limit(5);
//		s.forEach(n -> System.out.println(n));
		List<Integer> list=Arrays.asList(10,20,20,20,23,34,45,66,76,77);
//		for(Integer l:list) {
//			if(list.get(l)%2==0) {
//				System.out.println(list.get(l));
//			}
//		}
		List<Integer> evenlist =list.stream()
								.distinct()
								.filter(n->n%2==0)
								.limit(5)
							    .collect(Collectors.toList());
		evenlist.stream().forEach(System.out::println);

	}

}
