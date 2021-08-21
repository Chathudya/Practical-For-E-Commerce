package lk.ac.vau.Model;

public class PrimaryId<U> {
	private U id;
	
	public PrimaryId() {
		
	}
	public PrimaryId(U id) {
		super();
		this.id = id;
	}
	
	public U getId() {
		return id;
	}

	public void setId(U id) {
		this.id = id;
	}

	
}
