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
	public Highland(int rows, int columns) {
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
		System.out.println(startPosition);
		System.out.println(moveInstruction);
		return null;
		
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
