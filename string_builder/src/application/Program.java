package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime p1Date = LocalDateTime.parse("21/06/2028 13:05:44", fmt);
		
		String p1Title = "Traveling to New Zealand";
		String p1Content = "I'm going to visit this wonderful country!";
		int p1Likes = 12;
		Post post1 = new Post(p1Date, p1Title, p1Content, p1Likes);
		post1.addComment(new Comment("Have a nive trip!"));
		post1.addComment(new Comment("Wow that's awesome!"));
		System.out.println(post1);
		
		LocalDateTime p2Date = LocalDateTime.parse("28/07/2018 23:14:19", fmt);
		String p2Title = "Good night guys";
		String p2Content = "See you tomorrow";
		int p2Likes = 5;
		Post post2 = new Post(p2Date, p2Title, p2Content, p2Likes);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		System.out.println(post2);
	}

}
