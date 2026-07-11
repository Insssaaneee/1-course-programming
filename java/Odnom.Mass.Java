public class Main {
    public static void main(String[] args) {
        double[] z = {-2, 0, 3.5, 7, -12, 5, -1, 3};
        double[] r = new double[z.length];

        int index = 0;

        for (int i = 0; i < z.length; i++) {
            if (z[i] > 0) {
                r[index] = z[i];
                index++;
            }
        }

        for (int i = 0; i < z.length; i++) {
            if (z[i] <= 0) {
                r[index] = z[i];
                index++;
            }
        }

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }
}