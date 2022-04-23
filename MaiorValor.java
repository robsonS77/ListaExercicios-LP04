package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class MaiorValor {

	public static void main(String[] args) {
		
		maiorValor();
	}
	
	public static void maiorValor() {
		
		boolean contLoop = true;
		
		do {
			try {
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
				
				if(num1 > num2) {
					JOptionPane.showMessageDialog(null,"O maior valor é "+num1);
				}
				else {
					JOptionPane.showMessageDialog(null,"O maior valor é "+num2);
				}
				
				contLoop = false;
			}catch (NumberFormatException e) {  
				
				JOptionPane.showMessageDialog(null, "Digite somente números inteiros!!");
			}
			
		} while (contLoop);
	}
}
