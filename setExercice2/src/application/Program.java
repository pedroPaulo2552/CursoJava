package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> classA = new HashSet<>();
		Set<Integer> classB = new HashSet<>();
		Set<Integer> classC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int quant = sc.nextInt();
		addSet(quant, classA, sc);
		
		System.out.print("How many students for course B? ");
		quant = sc.nextInt();
		addSet(quant, classB, sc);
		
		System.out.print("How many students for course C? ");
		quant = sc.nextInt();
		addSet(quant, classC, sc);
		
		Set<Integer> setTotal = total(classA, classB, classC);
		System.out.println();
		System.out.println("Total students: " + setTotal.size());
		
		sc.close();

	}
	
	public static void addSet(int quant, Set<Integer> set, Scanner sc) {
		for(int q = 1; q <= quant; q++) {
			set.add(sc.nextInt());
		}
	}
	
	public static Set<Integer> total(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
		Set<Integer> setTotal = new HashSet<>(set1);
		setTotal.addAll(set2);
		setTotal.addAll(set3);
		return setTotal;
	}
}
