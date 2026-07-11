let z = [-2, 0, 3.5, 7, -12, 5, -1, 3];
let r = [];

for (let i = 0; i < z.length; i++) {
    if (z[i] > 0) {
        r.push(z[i]);
    }
}

for (let i = 0; i < z.length; i++) {
    if (z[i] <= 0) {
        r.push(z[i]);
    }
}

console.log(r.join(" "));