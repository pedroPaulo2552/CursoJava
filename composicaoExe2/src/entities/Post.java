package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String tittle;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>() ;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public Post() {
	}

	public Post(LocalDateTime moment, String tittle, String content, Integer likes) {
		this.moment = moment;
		this.tittle = tittle;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return this.moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public void addComments(String comment) {
		Comment cmt = new Comment(comment);
		this.comments.add(cmt);
	}
	
	public void showComments() {
		for (Comment c : this.comments) {
			System.out.println(c.getText());
		}
	}
	
	public String toString() {
		return this.getTittle() + "\n" + this.getLikes() + " - " + fmt.format(moment) + "\n" + this.getContent() + "\n" + "Comments:";
	}
	
}
