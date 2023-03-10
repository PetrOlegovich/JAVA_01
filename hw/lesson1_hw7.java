public class lesson1_hw7 {
    public static void main(String[] args) {
        
        int[][] qwad = new int[6][6];

        for (int i = 0; i < qwad.length; i++) {
            for (int j = 0; j < qwad[i].length; j++) {
                qwad[i][j] = 0;
                if(i == j){
                    qwad[i][j] = 1;
                }
                System.out.print(qwad[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nВОТ ТАК ВОТ \n");

    }
}
