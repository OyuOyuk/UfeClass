const prompt = require('prompt-sync')({ sigint: true }); 
var str = prompt("enter - ");
var vowels = "AEIOU";
var count = 0;

for(var i = 0; i<str.length; i++){
    if (vowels.includes(str[i].toUpperCase())){
        count++
    }
}
console.log(count)