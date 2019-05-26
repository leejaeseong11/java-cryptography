import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("알파벳을 입력해주세요");
		String alpa = sc.nextLine();
		int[] ialpa = new int[alpa.length()];

		for (int j = 0; j < alpa.length(); j++)
			ialpa[j] = (int) alpa.charAt(j);
		int[][] b = new int[alpa.length()][32];

		for (int j = 0; j < alpa.length(); j++)
			System.out.println("10진수  " + alpa.charAt(j) + " : " + ialpa[j]);

		int i = 0;
		for (int j = 0; j < alpa.length(); j++) {
			i = 0;
			while (ialpa[j] != 1) {
				b[j][i++] = ialpa[j] % 2;
				ialpa[j] = ialpa[j] / 2;
			}
			b[j][i] = ialpa[j];
		}
		for (int j = 0; j < alpa.length(); j++) {
			System.out.print("2진수  " + alpa.charAt(j) + " : ");
			for (int k = i; k >= 0; --k) {
				System.out.print(b[j][k]);
			}
			System.out.println();
		}

		sc.close();
	}
}