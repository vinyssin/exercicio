package aula1;

import javax.swing.JOptionPane; 

public class Main {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "BEM VINDO AO NOSSO CONSULTOR DE NUMEROS");
		JOptionPane.showMessageDialog(null, "Este programa identifica se o número que voce digitou é positivo, negativo ou neutro.");
		
		String nome =  JOptionPane.showInputDialog(null, "Digite seu nome");
		
			String algoritimo =  JOptionPane.showInputDialog(null, "Insira um número");
			int numero = Integer.parseInt(algoritimo);
		
				if(numero > 0) {
					JOptionPane.showMessageDialog(null,"Olá, "+ nome + " o numero que voce digitou é positivo: " + numero);
				}else if(numero <0) {
					JOptionPane.showMessageDialog(null,"Olá "+ nome +" o número que voce digitou é negativo: " + numero);
				}else {
					JOptionPane.showMessageDialog(null, "Olá " + nome + " o número que voce digitou é neutro: " + numero);

			} 
		}
}
