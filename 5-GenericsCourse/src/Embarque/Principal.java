package Embarque;
import java.util.Scanner;

import Controle.Aeronaves;

/*
 * Informar a quantidade de aeronaves no patio, o nº dos voos por ordem de chegada. 
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai. 
 * Mostrar qual o primeiro voo a decolar
 */
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Aeronaves air = new Aeronaves();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			int nrVoo = sc.nextInt();
			air.addVoo(nrVoo);	
		}
		System.out.println("O primeiro a decolar vai ser o nr : " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
		
	}

}
