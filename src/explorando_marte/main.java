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
		int[] inputProbePosition = null;
		String inputProbeDirection = null;
		char[] inputMoveInstructions = null;
		Input input = new Input();
		
		inputHighland = input.useInputNumberArray("Insira o tamanho do planalto no formato "
				+ "x, y \n Exemplo: 0 0");
				
		Highland highland = new Highland(inputHighland[0], inputHighland[1]); 
		System.out.println(highland);
		
		inputProbePosition = input.useInputNumberArray("Insira a posição inicial da Sonda \n"
				+ "Exemplo: 1 2");
		
		inputProbeDirection = input.useInputString("Insira a direção que da sonda de acordo com a "
				+ "rosa dos ventos \n exemplo:\n N - North \n S - South \n E - East \n W - West");
		
		System.out.println("Position Probe: " + inputProbePosition[0] + " " + inputProbePosition[1] + " " + 
		inputProbeDirection.toUpperCase());
		
		inputMoveInstructions = input.useInputTextArray("Insira as instruções de movimentação para a sonda"
				+ "\n Opções: \n L = Left, R = Right, M = Move \n Exemplo: \n LLMRLMRLMLMLMR");
		
		Direction direction = new Direction(inputProbeDirection);
		Position position = new Position(inputProbePosition[0], inputProbePosition[1], direction);
		highland.moveProbes(position, inputMoveInstructions);
		
		
		//try catch sondas 
		//primeira posição da sonda
		Probe probe = new Probe();
		
		
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