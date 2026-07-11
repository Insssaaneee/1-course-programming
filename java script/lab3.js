let a = -4.0;
let b = 4.0;
let h = 0.5;
let positiveCout = 0;

console.log("x\t\ty");

for (let x = a; x <= b + 0.0000001; x = x + h)
{
    let y;

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

    console.log(x + "\t\t" + y);

    if (y > 0)
    {
        positiveCount = positiveCount + 1;
    }
}

console.log("");
console.log("Количество положительных значений: " + positiveCount);