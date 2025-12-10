const prompt = require('prompt-sync')({ sigint: true }); 
var word = prompt("enter - ");
var savedword = []
for(var i = 0; i < word.length; i++){
    savedword[word.length - i - 1] = word[i]
    
}
// console.log(savedword.join(""))
if(savedword.join("") == word){
    console.log("this is a palindrome ");
}else{
    console.log("not a palindrome")
}