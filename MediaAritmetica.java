package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class MediaAritmetica {

	public static void main(String[] args) {

		boolean contLoop = true;
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		double media = 0;

		do {
			try {
				nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1� nota: "));
				nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2� nota: "));
				nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3� nota: "));
				nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4� nota: "));

				media = mediaAritm(nota1, nota2, nota3, nota4);

				JOptionPane.showMessageDialog(null, " A m�dia das notas � " + String.format("%.2f", media));

				contLoop = false;
			} catch (Exception e) {

				JOptionPane.showMessageDialog(null, " Digite somente n�meros e use o ponto como separador.");
			}
		} while (contLoop);
	}

	public static double mediaAritm(double nota1, double nota2, double nota3, double nota4) {

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}
}
