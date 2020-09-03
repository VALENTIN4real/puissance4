import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        plateau();
        entreeUtilisateur();
    }

    public static void plateau(){
        int x = 6;
        int y = 7;

        String[][] plateau = new String[x][y];

        for(int i = 0; i < x; i++) {
            for (int z = 0; z < y; z++) {
                plateau[i][z] = "   |";
                System.out.print(plateau[i][z]);
            }
            System.out.println("");
        }

        System.out.println(" 1   2   3   4   5   6   7   8");
    }

    public static void entreeUtilisateur(){
        if (tourJoueur() == 1) {
            System.out.println("Joueur 1, où voulez-vous jouer ?");
            caseAJouer();
        } else {
            System.out.println("Joueur 2, où voulez-vous jouer ?");
            caseAJouer();
        }


    }

    public static int tourJoueur(){
        int nbJoueur = 1;
        return nbJoueur;
    }

    public static int caseAJouer(){
        Scanner input = new Scanner(System.in);
        int numeroCase = input.nextInt();
        return numeroCase;
    }
}
