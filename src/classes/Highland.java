package classes;
import java.util.ArrayList;

public class Highland {
	private int rows;
	private int columns;
	private ArrayList<Probe> probes = new ArrayList();
		
	// Getters and Setters
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
	
	//Constructor
	public Highland(int columns, int rows) {
		super();
		this.rows = rows;
		this.columns = columns;
	}
	
	//Create probes
	public void createProbes(Probe probe) {
		this.probes.add(probe);
	}
	
	//Create moving probe
	public Probe moveProbes(Position startPosition, char[] moveInstruction) {
		
		Position preparedPosition = startPosition;
		for(char instruction : moveInstruction) {
			switch(instruction) {
				case 'L':
					preparedPosition.setDirection(this.moveLeft(preparedPosition));
					break;
				case 'R':
					preparedPosition.setDirection(this.moveRight(preparedPosition));
					break;
				case 'M':
					this.moving(startPosition);
				}
		}
		System.out.println(preparedPosition);
								
		return null;
		
	}
	
	// Logic for direction left
	public Direction moveLeft(Position startPosition) {
		Direction direction = startPosition.getDirection();
			switch(direction.toString()) {
				case "N":
					Direction directionInstanceN = new Direction("W");
					return directionInstanceN;
				case "W":
					Direction directionInstanceW = new Direction("S");
					return directionInstanceW;
				case "S":
					Direction directionInstanceS = new Direction("E");
					return directionInstanceS;
				case "E":
					Direction directionInstanceE = new Direction("N");
					return directionInstanceE;
			}
		return direction;
	}
	
	// Logic for direction right
	public Direction moveRight(Position startPosition) {
		Direction direction = startPosition.getDirection();
			switch(direction.toString()) {
				case "N":
					Direction directionInstanceN = new Direction("E");
					return directionInstanceN;
				case "W":
					Direction directionInstanceW = new Direction("N");
					return directionInstanceW;
				case "S":
					Direction directionInstanceS = new Direction("W");
					return directionInstanceS;
				case "E":
					Direction directionInstanceE = new Direction("S");
					return directionInstanceE;
			}
		return direction;
		
	}
	
	// Logic movimentation
	public void moving(Position startPosition) {
		int x = startPosition.getX();
		int y = startPosition.getY();
		String direction = startPosition.getDirection().toString();
		if ( x >= 0 && x <= this.columns && y >= 0 && y <= this.rows) {
			switch(direction) {				
				case "N":
					startPosition.setY(y + 1);
					break;
				case "W":
					startPosition.setX(x - 1);
					break;
				case "S":
					startPosition.setY(y - 1);
					break;
				case "E":
					startPosition.setX(x + 1);
					break;
			}
		}
		else {
			System.out.println("A sonda explodiu em: " + startPosition);
			System.exit(0);
		}
	
	}
	
	//Return probe
	public ArrayList<Probe> returnProbe() {
		return probes;
	}

	// Return in view
	@Override
	public String toString() {
		return "Este planalto tem " + rows + " linhas e " + columns + " colunas";
	}
}
