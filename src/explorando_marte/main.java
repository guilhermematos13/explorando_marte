package explorando_marte;

import javax.swing.JOptionPane;

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
		Position positionMoving = null;
		boolean flowContinue = true;

		inputHighland = input.useInputNumberArray("Insira o tamanho do planalto no formato " + "x, y \n Exemplo: 0 0");

		highland = new Highland(inputHighland[0], inputHighland[1]);

		while (flowContinue) {

			inputProbePosition = input.useInputNumberArray("Insira a posição inicial da Sonda \n" + "Exemplo: 1 2");

			inputProbeDirection = input.useInputString("Insira a direção que da sonda de acordo com a "
					+ "rosa dos ventos \n exemplo:\n N - North \n S - South \n E - East \n W - West");

			inputMoveInstructions = input.useInputTextArray("Insira as instruções de movimentação para a sonda"
					+ "\n Opções: \n L = Left, R = Right, M = Move \n Exemplo: \n LLMRLMRLMLMLMR");

			Position position = new Position(inputProbePosition[0], inputProbePosition[1],
					DirectionEnum.valueOf(inputProbeDirection));
			positionMoving = highland.moveProbes(position, inputMoveInstructions);

			inputContinuation = input.useInputString("Você deseja inserir mais alguma sonda ? \n N = não \n S = sim");
			switch (inputContinuation) {
			case "S":
				flowContinue = true;
				break;
			case "N":
				flowContinue = false;
				break;
			}
		}

		JOptionPane.showMessageDialog(null,
				"Informações da exploração de marte\n\n" + highland + "\n\n Position inicial da sonda: \n"
						+ inputProbePosition[0] + " " + inputProbePosition[1] + " " + inputProbeDirection.toUpperCase()
						+ "\n\nPosição Final foi: \n" + positionMoving

		);

	}
}