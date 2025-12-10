


const prompt = require('prompt-sync')({ sigint: true });
var arr = [];
for(var i = 0; i <5 ; i++){
    var num = prompt("enter number for array : ");
    arr.push(num)
}
var k= prompt("enter number : ");

var count = 0;
for(i of arr){
    if(i % k == 0){
        count = count + 1;
    }
}
console.log(count);