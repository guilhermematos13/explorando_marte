package classes;

import java.util.ArrayList;
import enums.DirectionEnum;

public class Highland {
	private int rows;
	private int columns;
	DirectionEnum direction;

	private ArrayList<Probe> probes = new ArrayList<>();

	// Getters and Setters

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// Constructor
	public Highland(int columns, int rows) {
		this.rows = rows;
		this.columns = columns;
	}

	// Create probes
	public void createProbes(Probe probe) {
		this.collisionValidate(probe);
		this.probes.add(probe);
	}

	// Collision validate
	public void collisionValidate(Probe probe) {
		for (Probe probeItem : this.probes) {
			System.out.println(probeItem + " " + probe);
			if (probeItem.getPosition().getX() == probe.getPosition().getX()
					&& probeItem.getPosition().getY() == probe.getPosition().getY()) {
				System.out.println("A sonda colidiu com outra sonda");
				System.exit(0);
			}
		}
	}

	// Create moving probe
	public Position moveProbes(Position position, char[] moveInstruction) {
		Position preparedPosition = position;
		for (char instruction : moveInstruction) {
			switch (instruction) {
			case 'L':
				preparedPosition.setDirectionEnum(this.moveLeft(preparedPosition));
				break;
			case 'R':
				preparedPosition.setDirectionEnum(this.moveRight(preparedPosition));
				break;
			case 'M':
				this.moving(position);
			}
		}
		Probe probe = new Probe(preparedPosition);
		this.createProbes(probe);
		System.out.println(this.probes);
		return preparedPosition;
	}

	// Logic for direction left
	public DirectionEnum moveLeft(Position startPosition) {
		DirectionEnum direction = startPosition.getDirection();
		switch (direction.toString()) {
		case "N":
			DirectionEnum directionInstanceN = DirectionEnum.W;
			return directionInstanceN;
		case "W":
			DirectionEnum directionInstanceW = DirectionEnum.S;
			return directionInstanceW;
		case "S":
			DirectionEnum directionInstanceS = DirectionEnum.E;
			return directionInstanceS;
		case "E":
			DirectionEnum directionInstanceE = DirectionEnum.N;
			return directionInstanceE;
		}
		return direction;
	}

	// Logic for direction right
	public DirectionEnum moveRight(Position startPosition) {
		DirectionEnum direction = startPosition.getDirection();
		switch (direction.toString()) {
		case "N":
			DirectionEnum directionInstanceN = DirectionEnum.E;
			return directionInstanceN;
		case "W":
			DirectionEnum directionInstanceW = DirectionEnum.N;
			return directionInstanceW;
		case "S":
			DirectionEnum directionInstanceS = DirectionEnum.W;
			return directionInstanceS;
		case "E":
			DirectionEnum directionInstanceE = DirectionEnum.S;
			return directionInstanceE;
		}
		return direction;

	}

	// Motion logic
	public void moving(Position position) {
		int x = position.getX();
		int y = position.getY();
		String directionEnum = position.getDirection().toString();
		if (x >= 0 && x < this.columns && y >= 0 && y < this.rows) {
			switch (directionEnum) {
			case "N":
				position.setY(y + 1);
				break;
			case "W":
				position.setX(x - 1);
				break;
			case "S":
				position.setY(y - 1);
				break;
			case "E":
				position.setX(x + 1);
				break;
			}
		} else {
			System.out.println("A sonda explodiu " + position);
			System.exit(0);
		}
	}

	// Return probe
	public ArrayList<Probe> returnProbe() {
		return (ArrayList<Probe>) probes;
	}

	// Return in view
	@Override
	public String toString() {
		return "Esse planalto tem " + rows + " linhas e " + columns + " colunas";
	}
}
