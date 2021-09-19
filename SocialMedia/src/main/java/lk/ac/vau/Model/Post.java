package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Post {
	@Id
	private long postId;
	private String title;
	private String content;
	@Column(columnDefinition = "datetime default now()")
	private String createdOn;
	@ManyToOne
	@JoinColumn(name="ownerId",referencedColumnName = "userId")
	private User owner;
	@OneToMany(mappedBy = "commentId")
	private List <Comment> comments;
	
	public Post() {
		
	}

	public Post(long postId, String title, String content, String createdOn, User owner, List<Comment> comments) {
		super();
		this.postId = postId;
		this.title = title;
		this.content = content;
		this.createdOn = createdOn;
		this.owner = owner;
		this.comments = comments;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
