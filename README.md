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

Código da classe principal

package br.com.senaitagua.sa1.app4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de passageiros especiais"));
		valor2 = 5000/valor1;
		
		if(valor1 <= 0){
			JOptionPane.showMessageDialog(null, "Quantidade incorrento");
		}
		else if (valor1 > 17) {
			JOptionPane.showMessageDialog(null, "Quantidade incorrento");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O valor dividido para os passageiros especiais foi de "+ valor2 + " reais");
		}
	}

}
    
----------------------------------------------------------------------------------
