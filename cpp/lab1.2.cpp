#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double x = 3;
    double y = 5;
    double h = x * y + sin(x) / abs(1 - y) * log(x);
    cout << h;
    }