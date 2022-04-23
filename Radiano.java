package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class Radiano {

	public static void main(String[] args) {

		boolean contLoop = true;

		do {
			try {
				double grau = Double.parseDouble(JOptionPane.showInputDialog("Imforme o valor do grau: "));

				double radio = radiano(grau);

				JOptionPane.showMessageDialog(null,
						"O radiano para o grau " + grau + " é " + String.format("%.3f", radio));

				contLoop = false;

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe somente números e use o ponto(.) como separador!");
			}
		} while (contLoop);
	}

	public static double radiano(double grau) {
		final double PI = 3.1415;
		return grau * PI / 180;
	}
}
