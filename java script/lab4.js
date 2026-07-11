const points = [
    [3, 2],
    [9, 6],
    [14, 2],
    [10, -3],
    [7, -2]
];

function triangleArea(p1, p2, p3) {
    const [x1, y1] = p1;
    const [x2, y2] = p2;
    const [x3, y3] = p3;
    return 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
}

let totalArea = 0;
totalArea += triangleArea(points[0], points[1], points[2]);
totalArea += triangleArea(points[0], points[2], points[3]);
totalArea += triangleArea(points[0], points[3], points[4]);

console.log(totalArea);