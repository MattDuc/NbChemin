import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    private static int Chemin(boolean[][] array, int M, int N, int abs, int ord, int nbChemin){ // Fonction pour chercher son Chemin
        if (abs == N - 1 && ord == M - 1){ // Si (1;1) alors 1 chemin possible
            return nbChemin + 1;
        }
        if (ord + 1 < M && array[ord + 1][abs]){ // Si on peut monter alors
            nbChemin = Chemin(array, M, N, abs, ord + 1, nbChemin);
        }
        if (abs + 1 < N && array[ord][abs + 1]){ // Si on peut aller vers la droite alors
            nbChemin = Chemin(array, M, N, abs + 1, ord, nbChemin);
        }
        return nbChemin;
    }


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int nbChemin = 0;
        boolean[][] array = new boolean[M][N];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String ROW = in.nextLine();

        for (int i = 0; i < M; i++){ // Pour chaque ligne
            for (int j = 0; j < N; j++){
                array[i][j] = ROW.charAt(j) == '0'; // On retourne en String des boolean false sur chaque colonne
            }
        }
        System.out.println(Chemin(array, M, N, 0, 0, nbChemin));
    }
}
