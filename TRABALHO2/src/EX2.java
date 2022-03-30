import java.util.Random;

public class EX2 {
	public static void main(String[] args) {
//		 Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com 
//		 valores inteiros aleatórios (gerados a partir da classe Random) e, em seguida, faça a impressão dos 
//		 elementos no formato de uma tabela (impressão como apresentado durante as aulas). Após a 
//		 impressão o seu programa deverá trocar os elementos armazenados no triângulo superior da matriz 
//		 com os elementos armazenados no triângulo inferior. Imprima novamente a matriz no vídeo para 
//		 conferência. Veja o exemplo abaixo indicando como a troca dos elementos deverá ser realizada. 

		int[][] nums = new int[4][4];
		generateNums(nums);
		printMatrix(nums);

		swapMatrix(nums);
		printMatrix(nums);
	}

	public static void swapMatrix(int[][] matrix) {
		int aux;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i != j) {
					aux = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = aux;
				}
			}
		}
	}

	public static void generateNums(int[][] matrix) {
		Random rng = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rng.nextInt(101);
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
	}
}
