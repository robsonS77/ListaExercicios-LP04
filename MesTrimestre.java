package listaExerciciosLP04;

import javax.swing.JOptionPane;

public class MesTrimestre {

	public static void main(String[] args) {
		
		mes();
	}
	
	public static void mes() {
		
		int mes = 0;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um mês do primeiro trimestre: "));
			
			if(mes == 1) {
				JOptionPane.showMessageDialog(null, mes+"  Janeiro");
			}
			else if(mes == 2) {
				JOptionPane.showMessageDialog(null, mes+"  Fevereiro");
			}
			else if(mes == 3) {
				JOptionPane.showMessageDialog(null, mes+"  Março");
			}
			else {
				JOptionPane.showMessageDialog(null, "Mês inválido!!");
			}
			
		}while(mes > 3);
	}
}
