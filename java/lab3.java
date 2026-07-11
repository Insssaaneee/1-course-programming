public class Main
{
    public static void main(String[] args)
    {
        double a = -4.0;
        double b = 4.0;
        double h = 0.5;
        int positiveCount = 0;

        System.out.println("x\t\ty");

        for (double x = a; x <= b + 0.0000001; x = x + h)
        {
            double y;

            if (x <= 0)
            {
                y = x * x - 1;
            }
            else if (x <= 1.5)
            {
                y = Math.cos(x);
            }
            else
            {
                y = Math.sin(x - 1);
            }

            System.out.println(x + "\t\t" + y);

            if (y > 0)
            {
                positiveCount = positiveCount + 1;
            }
        }
 
        System.out.println();
        System.out.println("Количество положительных значений: " + positiveCount);
    }
}