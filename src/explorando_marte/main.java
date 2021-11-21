package explorando_marte;
import classes.Direction;
import classes.Highland;
import classes.Position;
import classes.Probe;
import enums.DirectionEnum;
import shared.Input;

public class Main {
	
	public static void main(String[] args) {
		
		int[] inputHighland = null;
		
		Input input = new Input();
		inputHighland = input.useInput("Insira o tamanho do planalto no formato "
				+ "x, y \n Exemplo: 0 0", true);
				
		Highland highland = new Highland(inputHighland[0], inputHighland[1]); 
		System.out.println(highland);
		
		//try catch sondas 
		//primeira posição da sonda
		Probe probe = new Probe(highland);
		Direction direction = new Direction(DirectionEnum.S);
		Position position = new Position(0,0, direction);
		probe.setStartPosition(position);

		
		//movimento da sonda
		
		//proxima sonda? 
		
		//repete os passos acima
		
		
		//logica de movimento
		//logica de limites do planalto
		//logica de nao parar uma sonda em cima da outra
		
		
		//exibir as posições finais das sondas
		
		
		
	}
}