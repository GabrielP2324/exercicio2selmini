import java.util.Scanner;

//Escreva um programa em Java que leia inicialmente as dimensões da matriz (número 
//de linhas e número de colunas) e, em seguida, faça o preenchimento da matriz com valores inteiros 
//fornecidos pelo usuário. Após o preenchimento da matriz deverá ser lido via teclado um valor X e 
//o seu programa deverá fazer a busca desse valor na matriz. Se o valor for encontrado deverá ser 
//impresso no vídeo a sua localização (número da linha e número da coluna). Caso o valor não esteja 
//na matriz deverá ser impresso no vídeo a mensagem: “X não se encontra na matriz”. 
public class EX1 {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] nums = createMatrix();
		getMatrix(nums);

		System.out.println("Por favor informe um valor para procurar na matriz ->");
		int x = in.nextInt();

		findinMatrix(x, nums);
	}

	public static int[][] createMatrix() {
		System.out.print("Por favor informe o numero de linhas que serão utilizadas: ");
		int linhas = in.nextInt();
		System.out.print("Por favor informe o numero de colunas que serão utilizadas: ");
		int colunas = in.nextInt();
		int[][] matrix = new int[linhas][colunas];
		return matrix;
	}

	public static void findinMatrix(int n, int[][] nums) {
		boolean check = false;
		int[][] pos = new int[1][2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == n) {// basta encontrar o primeiro (acho) Verificar com Selmini
					pos[0][0] = i + 1;
					pos[0][1] = j + 1;
					check = true;
					break;
				}
			}
			if (check) {
				break;
			}
		}
		if (check) {
			System.out.println(n + " está na posição " + pos[0][0] + ", " + pos[0][1]);
		} else {
			System.out.println(n + " não está na matriz");
		}
	}

	public static void getMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Informe o valor da linha " + (i + 1) + " coluna " + (j + 1) + " -> ");
				m[i][j] = in.nextInt();
			}
		}
	}

}
