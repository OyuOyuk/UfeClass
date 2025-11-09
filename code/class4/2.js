const prompt = require('prompt-sync')({ sigint: true }); 

var word = prompt("enter - ");
var result = []

for(var i = 0 ; i< word.length; i++){
    if(word[i].toUpperCase() == word[i]){
        result += word[i].toLowerCase()
    }else{
        result += word[i].toUpperCase()
    }
}
console.log(result);