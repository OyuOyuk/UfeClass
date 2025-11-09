var arr = [];
for(var s = 0; s < 5 ; s++){
    var smallerarr = []
    for(var k = 0; k < 5; k++ ){
        smallerarr.push(parseInt(Math.random()*100));

    }
    arr.push(smallerarr)
}
console.log(arr)

for(var y = 0; y < arr.length; y++){
    for(var x = 0; x < arr[0].length; x++){
        if( x == (arr.length - y - 1) ){
            arr[y][x] = 0
        }
    }
}
console.log(arr)
