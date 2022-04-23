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
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero: "));
				
				if(num1 > num2) {
					JOptionPane.showMessageDialog(null,"O maior valor � "+num1);
				}
				else {
					JOptionPane.showMessageDialog(null,"O maior valor � "+num2);
				}
				
				contLoop = false;
			}catch (NumberFormatException e) {  
				
				JOptionPane.showMessageDialog(null, "Digite somente n�meros inteiros!!");
			}
			
		} while (contLoop);
	}
}
