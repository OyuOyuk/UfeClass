function longElement(arr){
    let longest_element = ''
    for(i of arr){
        if(i.length > longest_element.length){
            longest_element = i
        }
    }
    return longest_element
}

const prompt = require('prompt-sync')();
function inputArrays(){
    let input_arr = []
    do{
        var input_word = prompt('- ');
        if(input_word != ''){
            input_arr.push(input_word)
        }
        
    }while(input_word);
  


    return input_arr
}
var arr = inputArrays()

console.log(longElement(arr));