package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		System.out.println("Size: " + cookies.size());
		
		cookies.remove("email");
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Endereço: " + cookies.get("endereço"));
		
		System.out.println("ALL COOKIES");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
