function counter(){
    let privateNumber = 0
    function increment(number){
        privateNumber = privateNumber + parseInt(number)

    }
    function getNumber(){
        console.log(privateNumber)
    }
    return [increment, getNumber]
}

let funcarr = counter()

const prompt = require('prompt-sync')()
let answer = ''
do{
    console.log('Increment to add and getNumber to see')
    answer = prompt(' - ')
    if(answer == 'Increment'){
        let answer1 = prompt(' number  - ')
        funcarr[0](answer1)
    }else if(answer == 'getNumber'){
        funcarr[1]()
    }
}while(answer != '')

