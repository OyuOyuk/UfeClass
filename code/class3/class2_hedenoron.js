const prompt = require('prompt-sync')({ sigint: true });
var number = prompt("enter  number : ");
var num1 = number;
var count = 0
while(num1> 1){
    num1 = num1 / 10;
    count = count + 1;

}
console.log(number, " has ", count, " numbers");