package explorando_marte;
import classes.Direction;
import classes.Highland;
import classes.Position;
import classes.Probe;
import shared.Input;
import enums.DirectionEnum;

public class Main {
	
	public static void main(String[] args) {
		
		String inputHighland = null;
		
		Input input = new Input();
		input.useInput("Insira o tamanho do planalto no formato "
				+ "x, y \n Exemplo: 0 0", inputHighland);
		
		Highland highland = new Highland(0,0);
		Probe probe = new Probe(highland);
		Direction direction = new Direction(DirectionEnum.S);
		Position position = new Position(0,0, direction);
		probe.setStartPosition(position);
	}
}