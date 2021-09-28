package lk.ac.vau.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement
@Entity
public class Comment {
	@Id
	private long commentId;
	private String comment;
	@Column(columnDefinition = "datetime default now()")
	private String commentedOn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="commentedIn",referencedColumnName = "postId")
	private Post commentedIn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="commentedBy",referencedColumnName = "UserId")
	private User commentedBy;
	
	
	public Comment() {
		
	}
	public Comment(long commentId, String comment, String commentedOn, Post commentedIn, User commentedBy) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.commentedOn = commentedOn;
		this.commentedIn = commentedIn;
		this.commentedBy = commentedBy;
	}
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCommentedOn() {
		return commentedOn;
	}
	public void setCommentedOn(String commentedOn) {
		this.commentedOn = commentedOn;
	}
	@JsonIgnore
	public Post getCommentedIn() {
		return commentedIn;
	}
	public void setCommentedIn(Post commentedIn) {
		this.commentedIn = commentedIn;
	}
	@JsonIgnore
	public User getCommentedBy() {
		return commentedBy;
	}
	public void setCommentedBy(User commentedBy) {
		this.commentedBy = commentedBy;
	}
	
}
