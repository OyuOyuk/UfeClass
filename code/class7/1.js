// class person {
//     constructor(firstName, LastName, birthday){
//         this.firstName = firstName
//         this.LastName =LastName
//         this.birthday = birthday
//     }
    
// }
let person = {
    firstName : '',
    lastName : '',
    birthday : ''
}
const people = [

]
let answer
const prompt = require('prompt-sync')();
do{
    console.log('please use this format "firstName lastName birthday"')
    answer = prompt(' - ')
    let arr = answer.split(' ')
    let temptask = {
        firstName : arr[0],
        lastName : arr[1],
        birthday : arr[2]
    }

    if(temptask.firstName == ''  || temptask.lastName == undefined  || temptask.birthday == undefined){
        break
    }
    people.push(temptask)
}while(answer != '')


function getInfo(ppeople, setage){
    let today = new Date()
    for(p of ppeople){
        
        let birth = new Date(p.birthday)
        let age = today.getFullYear() - birth.getFullYear()

        if(age >= setage){
            console.log(p)
        }
    }
    

}
let a = prompt('age to search - ')

getInfo(people, a)