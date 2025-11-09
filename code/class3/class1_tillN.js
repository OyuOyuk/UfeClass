const prompt = require('prompt-sync')({ sigint: true });
var N = prompt("enter N number : ");

for(var i = 1; i <= N; i++){
    console.log(i)
}