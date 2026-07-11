#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    double a = -4.0;
    double b = 4.0;
    double h = 0.5;
    int positiveCount = 0;

    cout << "x\t\ty" << endl;

    for (double x = a; x <= b + 0.0000001; x = x + h)
    {
        double y;

        if (x <= 0)
        {
            y = x * x - 1;
        }
        else if (x <= 1.5)
        {
            y = cos(x);
        }
        else
        {
            y = sin(x - 1);
        }

        cout << x << "\t\t" << y << endl;

        if (y > 0)
        {
            positiveCount = positiveCount + 1;
        }
    }

    cout << endl;
    cout << "Количество положительных значений: " << positiveCount << endl;

    return 0;
}