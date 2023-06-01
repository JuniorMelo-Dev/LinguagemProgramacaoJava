package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		/*
		//declarando o array
		String [] paises = new String[5];
		 
		// inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Italia";
		paises[3] = "Austria";
		paises[4] = "Polonia";

		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país: ");
		}

		for (String lista: paises) {
			System.out.println(lista);
		}
		*/
		// inserindo dados no array
		int [] numeros = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		}
		// listando os valores do array com um ForEach
		System.out.println("Apos a entrada de dados");
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
		// calculando os valores para armazenar no array
		numeros[3] = numeros[2] + 2;
		System.out.println("\nApos a alteracao do valor na posicao 3");
		// listando os valores do array com um ForEach
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
	}

}
