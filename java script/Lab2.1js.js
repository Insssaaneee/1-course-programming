let b = 4;
let c = 3;
let x = 2;

let z;

if (x > 1) {
    z = Math.sqrt(b * b + c * c);
} else if (x < 0) {
    z = Math.min(Math.sqrt(b), x * x, x + c);
} else {
    z = Math.max(Math.log(b), x + c);
}

console.log(z);