package Date_27_7_2023;

public class Array2D1 {
    public static void main(String[] args) {
        int[][] n = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
