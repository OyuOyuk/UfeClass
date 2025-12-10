var arr = [];
for(var s = 0; s < 5 ; s++){
    var smallerarr = []
    for(var k = 0; k < 5; k++ ){
        smallerarr.push(parseInt(Math.random()*10));

    }
    arr.push(smallerarr)
}
console.log(arr);
var sum = 0;
for(i of arr){
    for(n of i){
        if (n % 2 == 0){
            sum = sum + n;
        }
    }
}
console.log(sum)