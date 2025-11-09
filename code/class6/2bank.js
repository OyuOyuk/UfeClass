class bankAccount{
    constructor(accountNumber, accountHolder, balance){
        this.accountNumber = accountNumber
        this.accountHolder = accountHolder
        this.balance = balance
    
    }
    addMoney(amount){
        this.balance = parseInt(this.balance) + parseInt(amount)
    }
    takeMoney(amount){
        this.balance = this.balance - amount
    }
    getInformation(){
        return this
        // return [this.accountNumber, this.accountHolder, this.balance]
    }
}
const prompt = require('prompt-sync')();
let number = prompt('number - ');
let holder = prompt('holder - ');
let balance = prompt('balance - ');
const account1 = new bankAccount(number, holder, balance);
console.log(account1.getInformation())
let amountadded = prompt('add - ');
account1.addMoney(amountadded)
console.log(account1.getInformation())

let amountremoved = prompt('remove - ');
account1.takeMoney(amountremoved)
console.log(account1.getInformation())
