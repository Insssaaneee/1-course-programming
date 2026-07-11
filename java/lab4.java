public class PentagonArea {
    public static void main(String[] args) {
        int[][] points = {
            {3, 2},
            {9, 6},
            {14, 2},
            {10, -3},
            {7, -2}
        };

        double totalArea = 0.0;
        totalArea += triangleArea(points[0], points[1], points[2]);
        totalArea += triangleArea(points[0], points[2], points[3]);
        totalArea += triangleArea(points[0], points[3], points[4]);

        System.out.println(totalArea);
    }

    public static double triangleArea(int[] p1, int[] p2, int[] p3) {
        int x1 = p1[0], y1 = p1[1];
        int x2 = p2[0], y2 = p2[1];
        int x3 = p3[0], y3 = p3[1];
        return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }
}