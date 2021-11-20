package classes;

public class Probe {
	//Variables
	private Position startPosition;
	private Position endPosition;
	private Highland highland;
	
	//Getters and Setters
	public Position getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(Position startPosition) {
		this.startPosition = startPosition;
	}
	public Position getEndPosition() {
		return endPosition;
	}
	public void setEndPosition(Position endPosition) {
		this.endPosition = endPosition;
	}
	protected Highland getHighland() {
		return highland;
	}
	
	//Constructor
	public Probe(Highland highland) {
		this.highland = highland;
		startPosition = null;
		endPosition = null;
	}
	
	// Return in view
	@Override
	public String toString() {
		return startPosition.toString();
	}

}
