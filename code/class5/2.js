function mergeArrays(arr1, arr2){
    let mixedarr = []
    let temparr = arr1.concat(arr2)
    for(i of temparr){
        if(!mixedarr.includes(i)){
            mixedarr.push(i)
        }
    }
    return mixedarr
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
var arra1 = inputArrays()
var arra2 = inputArrays()

console.log(mergeArrays(arra1, arra2))