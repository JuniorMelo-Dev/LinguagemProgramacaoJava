package Construtores;

import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados atraves do construtor com sobrecarga
		Aluno aluno = new Aluno( 8,  8,  8);
		// calculando a media
		double mediaAlunoFinal = aluno.calcularMediaAluno();
		
		// definindo situacao do aluno
		if (mediaAlunoFinal < 6 ) {
			aluno.situacaoAluno = STATUS.REPROVADO;
		} else {
			aluno.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situacao do aluno
		System.out.println("A media do aluno e : " 
			+ aluno.calcularMediaAluno() + " e o aluno esta " 
			+ aluno.situacaoAluno);
	}
}