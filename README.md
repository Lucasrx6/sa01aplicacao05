# Atividade Aula Java SENAI 
## sa01aplicacao5


Este programa tem a finalidade de resolver a quinta atividade da lista de exercicios


5 - (vai calcular a média total do faturamento trimestral da VoeAirlines)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215864279-63e0b26b-aeb4-41ef-891f-c4af5a67cb4d.PNG)


Resultado


![print2](https://user-images.githubusercontent.com/86980974/215864317-9debe7a7-4d10-40a3-b6f5-7d7a5c974114.PNG)


----------------------------------------------------------------------------------

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

    
----------------------------------------------------------------------------------

Codigo da classe auxiliar

package br.com.senaitagua.sa1.bo;
public class CalculaBO {	
	
	public double calcularMediaTrim(double mes1,double mes2,double mes3) {
		return (mes1+mes2+mes3)/3;
	}
}
