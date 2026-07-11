#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double b = 4;
    double c = 3;
    double x = 2;
    double z;
    
    if (x > 1) {
        z = sqrt(b * b + c * c);
    } else if (x < 0) {
        z = min(sqrt(b), min(x * x, x + c));
    } else {
        z = max(log(b), x + c);
    }
    
    cout << z;
    return 0;
}