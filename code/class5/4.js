function swap(x){
    let stringifiedx = x.toString()
    let saved = []
    if(stringifiedx.length % 2 == 0){
        for(let i = 0; i < stringifiedx.length; i += 2){
            saved[i+1] = stringifiedx[i]
            saved[i] = stringifiedx [i+1]
        }
        return parseInt(saved.join(''))
    }else{
        return false
    }
}

const prompt = require('prompt-sync')();
let input_number = prompt('- ');

console.log(swap(input_number));