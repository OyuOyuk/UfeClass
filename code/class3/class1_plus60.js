const prompt = require('prompt-sync')({ sigint: true }); // { sigint: true } allows handling Ctrl+C
var sum = 0;
for(var i =0; i < 4; i++){
    var number = prompt("please enter number - ");
    if(number >= 60){
        sum = sum + parseInt(number);

    }
}
console.log(sum);