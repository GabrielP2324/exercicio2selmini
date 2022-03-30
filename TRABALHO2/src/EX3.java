import java.util.*;

public class EX3 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
//		Escreva um programa em Java para fazer a corre��o de uma prova contendo 10 
//		quest�es de m�ltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o n�mero de alunos 
//		dever� ser informado pelo usu�rio da aplica��o). O programa dever� gerar as respostas dos alunos 
//		de forma aleat�ria e as respostas dever�o ser impressas no v�deo no formato de uma tabela 
//		(conforme apresentado durante as aulas). Em seguida, o programa dever� ler o gabarito da prova 
//		(a entrada dever� ser informada pelo usu�rio da aplica��o). O seu programa dever� emitir um 
//		relat�rio contendo a nota de cada aluno e a sua situa��o (aprovado ou reprovado) considerando 
//		que a nota para aprova��o dever� ser maior ou igual a 7. 

		System.out.print("Quantos alunos na sala? -> ");
		int students = in.nextInt();
		char[][] exam = new char[students][10];
		char[] markscheme = new char[10];

		generateAnswers(exam);

		generateMarkscheme(markscheme);

		gradeExam(exam, markscheme);

	}

	public static void gradeExam(char[][] exam, char[] marks) {
		int correctcount = 0;
		for (int i = 0; i < exam.length; i++) {
			for (int j = 0; j < exam[i].length; j++) {
				if (marks[j] == exam[i][j]) {
					correctcount++;
				}
			}
			System.out.println("Aluno " + (i + 1) + " recebeu nota: " + correctcount + "\t Passou? "
					+ (correctcount >= 7 ? "SIM" : "N�O"));

			correctcount = 0;
		}
	}

	public static void generateMarkscheme(char[] markscheme) {
		System.out.println("Coloque as respostas corretas");
		for (int i = 0; i < markscheme.length; i++) {
			System.out.print("Resposta " + (i + 1) + ":");
			markscheme[i] = in.next().charAt(0);
		}
	}

	public static void generateAnswers(char[][] exam) {
		Random rng = new Random();

		int[] choices = new int[10];
		for (int i = 0; i < exam.length; i++) {
			System.out.print("Respostas aluno " + (i + 1) + ":");
			for (int j = 0; j < exam[i].length; j++) {
				choices[j] = rng.nextInt(5);
				switch (choices[j]) {
				case 0:
					exam[i][j] = 'a';
					break;
				case 1:
					exam[i][j] = 'b';
					break;
				case 2:
					exam[i][j] = 'c';
					break;
				case 3:
					exam[i][j] = 'd';
					break;
				case 4:
					exam[i][j] = 'e';
					break;
				}
				System.out.print(exam[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
