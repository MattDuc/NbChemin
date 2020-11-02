import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    static int nbchemin(int M, int N){

        int cor[][] = new int[M][N];
        for (int i = 0; i < M; i++)

            cor[i][0] = 1;

        for (int j = 0; j < M; j++)

            cor[0][j] = 0;

        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++)


                cor[i][j] = cor[i - 1][j] + cor[i][j - 1];
        }

        return cor[M - 1][N - 1];
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        System.out.println(nbchemin(M,N));
    }
}
