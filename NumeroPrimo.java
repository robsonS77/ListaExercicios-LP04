package listaExerciciosLP04;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {

		numeroPrimo();
	}

	public static void numeroPrimo() {

		boolean contiLoop = true;
		int num = 0;

		do {
			try {

				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

				if (numPrimo(num)) {
					JOptionPane.showMessageDialog(null, "O número " + num + " é primo!!");
				} else {
					JOptionPane.showMessageDialog(null, "O número " + num + " não é primo!!");
				}
				contiLoop = false;
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Digite um número inteiro!!");
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite um número inteiro!!");
			}

		} while (contiLoop);

	}

	private static boolean numPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}