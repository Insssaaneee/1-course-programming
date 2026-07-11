using System;

class Program
{
    static void Main()
    {
        double b = 4;
        double c = 3;
        double x = 2;
        double z;
        bool s = true;

        if(!s){

        }
        
        if (x > 1 || c < 1)
        {
            z = Math.Sqrt(b * b + c * c);
        }
        else if (x < 0)
        {
            z = Math.Min(Math.Sqrt(b), Math.Min(x * x, x + c));
        }
        else
        {
            z = Math.Max(Math.Log(b), x + c);
        }
        
        Console.WriteLine(z);
    }
}