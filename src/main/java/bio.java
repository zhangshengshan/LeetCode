public class bio {
    private static double bi(int N, int k, double p) {
        double[][] b = new double[N + 1][k + 1];

        // base cases
        for (int i = 0; i <= N; i++) {
            b[i][0] = Math.pow(1.0 - p, i);
        }
        for (int i = 0; i <= k; i++) {
            b[0][i] = 0.0;
        }
        b[0][0] = 1.0;

        // recursive formula
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= k; j++) {
                b[i][j] = p * b[i - 1][j - 1] + (1.0 - p) * b[i - 1][j];
            }
        }
        return b[N][k];
    }

    public static void main(String[] args) {
        System.out.println(bi(10000, 5000, 0.5));
    }
}
