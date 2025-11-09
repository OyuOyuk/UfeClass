const prompt = require('prompt-sync')({ sigint: true });
var number = prompt("enter number : ");
var isanhnitoo = true;
for(var i = 2; i < number; i++){
    if(number % i == 0){
        isanhnitoo = false;
        break;
    }

}
console.log("is it anhnitoo ? ", isanhnitoo)