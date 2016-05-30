package MIdtest_160417;

import java.util.*;

public class page175_TicTacToc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] game = new char[3][3];
		for (int l = 0; l < 3; l++) {
			for (int m = 0; m < 3; m++) {
				game[l][m] = ' ';
			}
		}
		Scanner input = new Scanner(System.in);
		do {
			for (int i = 0; i < game.length; i++) {
				System.out.println(" " + game[i][0] + " " + "|" + " " + game[i][1] + " " + "|" + " " + game[i][2]);
				System.out.println("---|---|---");
			}

			System.out.println("다음 수의 좌표를 입력하시오. : ");
			int a = input.nextInt();
			int b = input.nextInt();
			if (!((0 <= a && a <= 2) && (0 <= b && b <= 2))) {
				continue;
			}
			if (game[a][b] != ' ') {
				System.out.println("잘못된위치입니다.");
				continue;
			} else {
				game[a][b] = 'O';
			}
			int i=0, j = 0;
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					if(game[i][j]==' ')
						break;
				if(game[i][j]==' ')
					break;
			}
			if(i<3 && j<3)
			 game[i][j]='X';
						
			
		} while (true);

	}
}
