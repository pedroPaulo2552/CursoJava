package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		
		Map<String, Integer> candidates = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				if (candidates.get(fields[0]) != null) {
					candidates.put(fields[0], candidates.get(fields[0]) + Integer.parseInt(fields[1]));
				} else {
					candidates.put(fields[0], Integer.parseInt(fields[1]));
				}
				
				line = br.readLine();
			}
			
			for (String key : candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}
			
		} catch(IOException e) {
			
		}
		
		
		
		sc.close();

	}

}
