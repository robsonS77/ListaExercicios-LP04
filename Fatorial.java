package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		fatorial();
	}

	public static void fatorial() {

		int fat = 1;
		int aux = 0;
		boolean contLoop = true;

		do {
			try {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				aux = num;
				while (num > 1) {
					fat = fat * num;
					num--;
				}
				JOptionPane.showMessageDialog(null, "O fatorial de "+aux+" é "+ fat);
				contLoop = false;
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Digite um número inteiro!!");
			}

		} while (contLoop);
	}
}