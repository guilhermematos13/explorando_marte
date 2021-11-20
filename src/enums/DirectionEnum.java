package enums;

public enum DirectionEnum {
	NORTH(0), WEST(90),SOUTH(180),EAST(270);
	
	private DirectionEnum(int angle) {
		this.angle = angle;
	}
	
	private int angle;
	
	public int getAngle() {
		return angle;
	}
}
