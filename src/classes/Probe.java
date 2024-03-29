package classes;

public class Probe {
	// Variables
	private Position position;

	// Getters and Setters
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	// Constructor
	public Probe(Position position) {
		this.position = position;
	}

	// Return in view
	@Override
	public String toString() {
		return position.toString();
	}

}
