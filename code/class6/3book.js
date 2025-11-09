class Book{
    constructor (name, authorName, publishedDate, quantity, genre, price){
        this.name = name
        this.authorName = authorName
        this.publishedDate = publishedDate
        this.quantity = quantity
        this.genre = genre
        this.price = price

    }
    changePrice(nprice){
        this.price = nprice
    }
    changeGenre(ngenre){
        this.genre = ngenre

    }
    changeQuantity(nquantity){
        this.quantity = nquantity
    }
    changeNameAndAuthor(nname, nauthor){
        this.name = nname
        this.authorName = nauthor
    }
    changePublishedDate(ndate){
        this.publishedDate = ndate
    }
    getinformation(){
        return this
    }
}
const prompt = require('prompt-sync')();
let name = prompt('name - ');
let author = prompt('author - ');
let date = prompt('date - ');
let quantity = prompt('quantity - ');
let genre = prompt('genre - ');
let price = prompt('price - ');

const book1 = new Book(name, author, date, quantity, genre, price);

console.log(book1.getinformation());

name = prompt('name - ');
author = prompt('author - ');


book1.changeNameAndAuthor(name, author);

date = prompt('date - ');

book1.changePublishedDate(date);

quantity = prompt('quantity - ');

book1.changeQuantity(quantity)

book1.changeGenre(prompt('genre - '));

book1.changePrice(prompt('price - '));

console.log(book1.getinformation());
