package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		/*list.removeIf(x -> x.charAt(0) == 'M');*/
		
		/*System.out.println(list.size());*/
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		/*for (String x : result) {
			System.out.println(x);
		}*/
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		/*System.out.println(list.indexOf("Bob"));*/
		
	}

}
