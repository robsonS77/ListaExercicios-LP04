package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class MesTrimestre {

	public static void main(String[] args) {
		
		mes();
	}
	
	public static void mes() {
		
		int mes = 0;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um m�s do primeiro trimestre: "));
			
			if(mes == 1) {
				JOptionPane.showMessageDialog(null, mes+"  Janeiro");
			}
			else if(mes == 2) {
				JOptionPane.showMessageDialog(null, mes+"  Fevereiro");
			}
			else if(mes == 3) {
				JOptionPane.showMessageDialog(null, mes+"  Mar�o");
			}
			else {
				JOptionPane.showMessageDialog(null, "M�s inv�lido!!");
			}
			
		}while(mes > 3);
	}
}
