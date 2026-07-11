using System;

class PentagonArea
{
    static void Main()
    {
        int[,] points = {
            {3, 2},
            {9, 6},
            {14, 2},
            {10, -3},
            {7, -2}
        };

        double totalArea = 0.0;
        totalArea += TriangleArea(points[0, 0], points[0, 1], points[1, 0], points[1, 1], points[2, 0], points[2, 1]);
        totalArea += TriangleArea(points[0, 0], points[0, 1], points[2, 0], points[2, 1], points[3, 0], points[3, 1]);
        totalArea += TriangleArea(points[0, 0], points[0, 1], points[3, 0], points[3, 1], points[4, 0], points[4, 1]);

        Console.WriteLine(totalArea);
    }

    static double TriangleArea(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        return 0.5 * Math.Abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }
}