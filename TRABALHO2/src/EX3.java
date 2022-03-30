import java.util.*;

public class EX3 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
//		Escreva um programa em Java para fazer a correção de uma prova contendo 10 
//		questões de múltipla escolha (a, b, c, d ou e) de uma turma contendo X alunos (o número de alunos 
//		deverá ser informado pelo usuário da aplicação). O programa deverá gerar as respostas dos alunos 
//		de forma aleatória e as respostas deverão ser impressas no vídeo no formato de uma tabela 
//		(conforme apresentado durante as aulas). Em seguida, o programa deverá ler o gabarito da prova 
//		(a entrada deverá ser informada pelo usuário da aplicação). O seu programa deverá emitir um 
//		relatório contendo a nota de cada aluno e a sua situação (aprovado ou reprovado) considerando 
//		que a nota para aprovação deverá ser maior ou igual a 7. 

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
					+ (correctcount >= 7 ? "SIM" : "NÃO"));

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
