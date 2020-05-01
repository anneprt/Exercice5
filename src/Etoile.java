public class Etoile {
    public static void main(String[] args) {
        int[][] Etoile = new int[7][7];
        //initialisation du tableau
        for (int i = 0; i < Etoile.length; i++) {
            for (int j = 0; j < Etoile[0].length; j++) {
                //1ere diagonale
                Etoile[i][i] = 1;
                //3e ligne
                Etoile[3][i] = 1;
                //3e colonne
                Etoile[i][3] = 1;
                //2e digonale
                Etoile[i][6-i] = 1;

            }
        }
        //Affichage du tableau
        for (int i = 0; i < Etoile.length; i++) {
            for (int j = 0; j < Etoile[0].length; j++) {
                if(Etoile[i][j] == 0) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
