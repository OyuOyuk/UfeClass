class room{
    constructor (roomNumber, roomSize, price){
        this.roomNumber = roomNumber
        this.roomSize = roomSize
        this.price = price
    }
    getInformation (){
        return [this.roomNumber, this.roomSize, this.price]
    }
    changeRoomSize (newSize){
        this.roomSize = newSize
    }
}
const prompt = require('prompt-sync')();

let number = prompt('number - ');
let size = prompt('size - ');
let price = prompt('price - ');
const room1 = new room(number, size, price);
console.log(room1.getInformation())
let newize = prompt('new size - ')

room1.changeRoomSize(newize)
console.log(room1.getInformation())
