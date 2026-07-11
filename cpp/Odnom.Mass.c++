#include <iostream>
using namespace std;

int main() {
    double z[] = {-2, 0, 3.5, 7, -12, 5, -1, 3};
    int n = 8;
    double r[8];

    int index = 0;

    for (int i = 0; i < n; i++) {
        if (z[i] > 0) {
            r[index] = z[i];
            index++;
        }
    }

    for (int i = 0; i < n; i++) {
        if (z[i] <= 0) {
            r[index] = z[i];
            index++;
        }
    }

    for (int i = 0; i < n; i++) {
        cout << r[i] << " ";
    }

    return 0;
}