var arr = [[2, 1, 1], [1, 2, 1], [1, 1, 1]];
// for(var s = 0; s < 5 ; s++){
//     var smallerarr = []
//     for(var k = 0; k < 5; k++ ){
//         smallerarr.push(parseInt(Math.random()*10));

//     }
//     arr.push(smallerarr)
// }

var answer = 1
for(var y = 0; y < arr.length; y++){
    for(var x = 0; x < arr[0].length; x++){
        if(x == 0 || x == arr.length -1 || y == 0 || y == arr.length -1 ){
            answer = arr[y][x] * answer
            
        }
    }
}
console.log(arr)
console.log(answer)