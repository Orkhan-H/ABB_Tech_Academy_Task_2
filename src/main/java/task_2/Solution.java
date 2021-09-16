package task_2;

public class Solution {
    public static int solution(int[][] A) {
        //Rows value
        int N = A.length;
        //Columns value
        int M = A[0].length;
        //it is array in which we check all visited places
        int[][] used = new int[N][M];
        int count = 0;
        //Fill this array
        for (int i = 0; i < N; i++) {
            System.arraycopy(A[i], 0, used[i], 0, M);
        }

        //Solution part
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (used[i][j] > 0) {
                    checkArray(A, used, i, j, N, M);
                    count++;
                }
            }
        }
        return count;

    }

    public static void checkArray(int[][] a, int[][] used, int x, int y, int N, int M) {
        if (used[x][y] == 0) return;
        used[x][y] = 0;

        if (y + 1 < M) {
            if (a[x][y + 1] == a[x][y]) checkArray(a, used, x, y + 1, N, M);
        }

        if (x + 1 < N) {
            if (a[x + 1][y] == a[x][y]) checkArray(a, used, x + 1, y, N, M);
        }

        if (x - 1 >= 0) {
            if (a[x - 1][y] == a[x][y]) checkArray(a, used, x - 1, y, N, M);
        }


        if (y - 1 >= 0) {
            if (a[x][y - 1] == a[x][y]) checkArray(a, used, x, y - 1, N, M);
        }

    }
}
