package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Users;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Users> users = new HashSet<>();
		
		String path = "C:\\Users\\paulo\\eclipse-workspace\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path));) {
			String line = br.readLine();
			while(line != null) {
				String[] camps = line.split(" ");
				users.add(new Users(camps[0], Instant.parse(camps[1])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("Total users: " + users.size());
		
		sc.close();

	}

}
