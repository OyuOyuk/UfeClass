const prompt = require('prompt-sync')({ sigint: true });
var number1 = prompt("enter 1st number : ");
var number2 = prompt("enter 2nd number : ");
var smallest 
if(number1 > number2){
    smallest = number2
}else{
    smallest = number1
}
var divider=1
for(var i = 1; i <= smallest; i++){
    if(number1 %i ==0 && number2%i ==0){
        divider = i;
    }
}
console.log(divider)