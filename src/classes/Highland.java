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
					this.moving(preparedPosition);
			}
		}
		System.out.println(startPosition);
		System.out.println(preparedPosition);
		
//		x não pode ser maior que collumn
//		y não pode ser maior que row
		
		
		//0 = N
		// se ele ta no North e vira pra esquerda, ele vai pra 90 (West)
		// se ele ta no North e vira pra direita, ele vai pra 270 (East)
		//x, y +1

		//90 = W 
		// se ele ta no West e vira pra esquerda, ele vai pra 180 (South)
		// se ele ta no West e vira pra direita, ele vai pra 0 (North)
		//x - 1, y


		//180 = S
		// se ele ta no West e vira pra esquerda, ele vai pra 270 (East)
		// se ele ta no West e vira pra direita, ele vai pra 90 (West)
		//x , y - 1


		//270 = E
		// se ele ta no West e vira pra esquerda, ele vai pra 0 (North)
		// se ele ta no West e vira pra direita, ele vai pra 180 (South)
		//x + 1, y

		
		// loop para ele se mover até o fim das instruções
		
		//pegar o x, y e a direção final
		
		
		
		return null;
		
	}
	
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
	
	public void moving(Position startPosition) {
		int x = startPosition.getX();
		int y = startPosition.getY();
		if ( x >= 0 && x <= this.columns && y >= 0 && y <= this.rows) {
			
		}
		else {
			System.out.println("A sonda explodiu");
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
