package explorando_marte;

import classes.Highland;
import classes.Position;
import enums.DirectionEnum;
import shared.Input;

public class Main {

	public static void main(String[] args) {

		int[] inputHighland = null;
		int[] inputProbePosition = null;
		char[] inputMoveInstructions = null;
		String inputProbeDirection = null;
		String inputContinuation = null;
		Input input = new Input();
		Highland highland = null;
		boolean flowContinue = true;

		inputHighland = input.useInputNumberArray("Insira o tamanho do planalto no formato " + "x, y \n Exemplo: 0 0");

		highland = new Highland(inputHighland[0], inputHighland[1]);

		while (flowContinue) {

			inputProbePosition = input.useInputNumberArray("Insira a posi��o inicial da Sonda \n" + "Exemplo: 1 2");

			inputProbeDirection = input.useInputString("Insira a dire��o que da sonda de acordo com a "
					+ "rosa dos ventos \n exemplo:\n N - North \n S - South \n E - East \n W - West");

			inputMoveInstructions = input.useInputTextArray("Insira as instru��es de movimenta��o para a sonda"
					+ "\n Op��es: \n L = Left, R = Right, M = Move \n Exemplo: \n LLMRLMRLMLMLMR");

			Position position = new Position(inputProbePosition[0], inputProbePosition[1],
					DirectionEnum.valueOf(inputProbeDirection));
			highland.moveProbes(position, inputMoveInstructions);

			inputContinuation = input.useInputString("Voc� deseja inserir mais alguma sonda ? \n N = n�o \n S = sim");
			switch (inputContinuation) {
			case "S":
				flowContinue = true;
				break;
			case "N":
				flowContinue = false;
				break;
			default:
				flowContinue = false;
				break;
			}
		}

		System.out.println("Posi��es finais das sondas foram: \n" + highland.returnProbe());
		

	}
}