var days = ['monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday', 'sunday'];

const prompt = require('prompt-sync')({ sigint: true }); // { sigint: true } allows handling Ctrl+C
do{
    var number = prompt("please enter number (1 - 7) - ");

}
while(number < 1  || number > 7)



console.log(days[number - 1])
 