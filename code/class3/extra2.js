var arr = [];
for(var s = 0; s < 5 ; s++){
    var smallerarr = []
    for(var k = 0; k < 5; k++ ){
        smallerarr.push(parseInt(Math.random()*100));

    }
    arr.push(smallerarr)
}
var sum = 0
for(y of arr){
    for(x of y){
        if(x % 5 == 0 || x % 10 == 0){
            sum = sum + x;
        }
    }
}
console.log(arr);
console.log(sum);
