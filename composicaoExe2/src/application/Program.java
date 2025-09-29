package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Post;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime moment = LocalDateTime.parse("21/06/2018 13:05:44", fmt);
		String tittle = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful conuntry!";
		Integer likes = 12;
		Post post1 = new Post(moment, tittle, content, likes);
		String cmt1 = "Have a nice trip";
		post1.addComments(cmt1);
		String cmt2 = "Wow that's awesome!";
		post1.addComments(cmt2);
		LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", fmt);
		String tittle2 = "Good nigth guys";
		String content2 = "See you tomorrow";
		Integer likes2 = 5;
		Post post2 = new Post(moment2, tittle2, content2, likes2);
		String cmt3 = "Good nigth";
		post2.addComments(cmt3);
		String cmt4 = "May the force be with you";
		post2.addComments(cmt4);
		System.out.println(post1);
		post1.showComments();
		System.out.println();
		System.out.println(post2);
		post2.showComments();
	}

}
