using System;

class Program
{
    static void Main()
    {
        double[] z = { -2, 0, 3.5, 7, -12, 5, -1, 3 };
        double[] r = new double[z.Length];

        int index = 0;

        for (int i = 0; i < z.Length; i++)
        {
            if (z[i] > 0)
            {
                r[index] = z[i];
                index++;
            }
        }

        for (int i = 0; i < z.Length; i++)
        {
            if (z[i] <= 0)
            {
                r[index] = z[i];
                index++;
            }
        }

        for (int i = 0; i < r.Length; i++)
        {
            Console.Write(r[i] + " ");
        }
    }
}