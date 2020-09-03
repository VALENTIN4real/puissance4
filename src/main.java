public class main {
    public static void main(String[] args) {
        plateau();
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
}
