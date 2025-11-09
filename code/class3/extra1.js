const prompt = require('prompt-sync')({ sigint: true });

var x = prompt("X axis - ");
var y = prompt("Y axis - ");
var arr = []
for(var i = 0; i < y; i++){
    var smallarr = []
    for(var n = 0; n < x; n++){
        smallarr.push(0);
    }
    arr.push(smallarr);
}
console.log(arr);