function jumble(word){
    let new_word = []
    for(var i = 0; i < word.length; i++){
        if(word[i] == word[i].toUpperCase()){
            new_word.push(word[i].toLowerCase())
        }else{
            new_word.push(word[i].toUpperCase())
        }
    }
    
    return new_word.join('');

}

const prompt = require('prompt-sync')();
let input_word = prompt('- ');

console.log(jumble(input_word))