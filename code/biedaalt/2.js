const prompt = require('prompt-sync')();
let word = prompt(' - ');
let vowels = [97,101,105,111, 121,117]
let fixedword = []

for(let i = 0; i < word.length; i++){
    
    if(vowels.includes(word.charCodeAt(i))){
        // console.log(word.charCodeAt(i))

        fixedword.push(word[i].toUpperCase())
    }else{
        fixedword.push(word[i])
    }
}
console.log(fixedword.join(''))