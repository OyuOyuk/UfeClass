function power(num){
    return num * num
}
const prompt = require('prompt-sync')();
let arr = []
let len = prompt('length - ')

for(let i = 0; i < len ; i++){
    arr[i] = Math.ceil( Math.random() * 100)
}

console.log(arr)

arr = arr.map(power)


console.log(arr)
