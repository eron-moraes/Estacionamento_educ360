package Estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		ArrayList<Carro> lista = new ArrayList<Carro>();
		
		char controle = 's';
		do {
			
			System.out.println("Digite o numero da vaga: ");
			int v = leia.nextInt();
			
			System.out.println("Digite a placa: ");
			String p = leia.next();
			
			System.out.println("Digite o nome: ");
			String n = leia.next();
			 
			Carro c = new Carro(p,n,v);
			lista.add(c);
			
			System.out.println("Deseja continuar Estacionando? 'S' para sim ou 'N' para nao");
			controle = leia.next().charAt(0);
		} while(controle == 's' || controle == 'S');
		
		for (Carro i: lista) {
			System.out.println(i);
		}
		 
	}

}
