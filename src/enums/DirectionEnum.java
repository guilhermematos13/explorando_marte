package enums;

public enum DirectionEnum {

	N("0"),
	W("90"),
	S("180"),
	E("270");

	private String description;

	private DirectionEnum(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
