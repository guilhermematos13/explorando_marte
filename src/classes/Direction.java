package classes;

import enums.DirectionEnum;


public class Direction {
	//Variables
	DirectionEnum direction;

	//Getters and Setters
	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}
	
	//Constructor
	public Direction(DirectionEnum direction) {
		this.direction = direction;
	}
	
	// Return in view
	@Override
	public String toString() {
		return direction.toString();
	}

}
