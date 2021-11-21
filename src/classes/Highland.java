package classes;

public class Highland {
	private int rows;
	private int columns;
	
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

	// Return in view
	@Override
	public String toString() {
		return "Este planalto tem " + rows + " linhas e " + columns + " colunas";
	}
}
