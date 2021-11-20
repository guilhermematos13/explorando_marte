package enums;

public enum DirectionEnum {

	N("NORTH"),
	W("WEST"),
	S("SOUTH"),
	E("EAST");

	private String description;

	private DirectionEnum(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
