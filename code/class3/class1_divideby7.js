const prompt = require('prompt-sync')({ sigint: true }); // { sigint: true } allows handling Ctrl+C
var count = 0;
for(var i =0; i < 4; i++){
    var number = prompt("please enter number - ");
    if(number % 7 == 0){
        count = count + 1;

    }
}
console.log(count);