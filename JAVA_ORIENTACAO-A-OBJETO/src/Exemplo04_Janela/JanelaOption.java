package Exemplo04_Janela;

import javax.swing.JOptionPane;

public class JanelaOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
									 //ALIGN - MESSAGE - MESSAGE2 -TIPO - ICON - ARRAY BUTTON (YES/NO) - BUTTON FOCUS (enter)
		String[] texto = {"Sim", "N�o"};
		JOptionPane.showOptionDialog(null, "Deseja finalizar a aplica��o?", "Confirma��o", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, texto, texto[0]);
		
	}

}
