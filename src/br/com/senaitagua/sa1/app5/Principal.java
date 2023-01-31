package br.com.senaitagua.sa1.app5;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculaBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculaBO fbo = new CalculaBO();
		
		String lerJan = JOptionPane.showInputDialog("Janeiro:");
		String lerFev = JOptionPane.showInputDialog("Fevereiro:");
		String lerMar = JOptionPane.showInputDialog("Março:");
		

		double v1,v2,v3;
		v1 = Double.parseDouble(lerJan);
		v2 = Double.parseDouble(lerFev);
		v3 = Double.parseDouble(lerMar);
		

		JOptionPane.showMessageDialog(null,fbo.calcularMediaTrim(v1, v2, v3));
		
	}

}

