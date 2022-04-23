package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {

		boolean contLoop = true;
		
		do {
			try {
				Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
				Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número: "));

				double res = produto(num1, num2);

				JOptionPane.showMessageDialog(null, "O produto de " + num1 + " por " + num2 + " é " 
				+ String.format("%.2f",res));
				contLoop = false;

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Digite somente números e use o ponto(.) como separador!");
			}
		} while (contLoop);
	}

	public static double produto(double num1, double num2) {
		return num1 * num2;
	}
}
