package Assignment;
import java.util.Scanner;

public class classPr_9_2 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int[][] board = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        Pr_9 a = new Pr_9(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean c = a.isAllowed(i, j, board[i][j]);

                if (c == true) {
                    count++;
                }

            }
        }
        if (count == 81) {
            System.out.print("Valid");
        } else {
            System.out.print("Invalid");
        }
    }

}
