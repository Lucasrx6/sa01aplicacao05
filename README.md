# Atividade Aula Java SENAI 
## sa01aplicacao5


Este programa tem a finalidade de resolver a quinta atividade da lista de exercicios


5 - (vai calcular a média total do faturamento trimestral da VoeAirlines)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215865254-63c361d6-46e3-429e-8010-7f5518337790.PNG)

![print2](https://user-images.githubusercontent.com/86980974/215865276-987c2640-1af8-4dd0-ba66-d1ffffeafc10.PNG)


![print3](https://user-images.githubusercontent.com/86980974/215865289-a354119b-e71c-479c-89df-b374bcc94415.PNG)



Resultado


![print4](https://user-images.githubusercontent.com/86980974/215865314-45262064-bb90-48ed-abc2-12167ec3726d.PNG)


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
