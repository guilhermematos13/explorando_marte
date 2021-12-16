package classes;

import enums.DirectionEnum;

public class Position {
	// Variables
	private int x;
	private int y;
	private DirectionEnum direction;

	// Getters and Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirectionEnum(DirectionEnum direction) {
		this.direction = direction;
	}

	// Constructor
	public Position(int x, int y, DirectionEnum direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	// Return in view
	@Override
	public String toString() {
		return x + " " + y + " " + direction;
	}
}
