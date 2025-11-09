const prompt = require('prompt-sync')({ sigint: true }); 
var sentence = prompt("enter - ");
var arr = sentence.split(" ")
var new_arr = []
for(var i = 0; i < arr.length; i++){
    if(arr[i] != ''){
        new_arr.push(arr[i])
    }
}
console.log(new_arr)
console.log(new_arr.length)