var arr = [];
for(var s = 0; s < 20 ; s++){
    arr.push(parseInt(Math.random()*10));
}
// const prompt = require('prompt-sync')({ sigint: true });
// var number = prompt("enter number : ");
var counter_arr = [];
var big_counter_arr = [];
var count = 1;
var last_number ;
for(i of arr){
    if(i == last_number){
        count= count + 1;

    }else{
        var isitthere = false;
        for(n of big_counter_arr){
            if( n[0] == last_number){
                n[1] = n[1] + count

                isitthere= true;
            }
        }
        if(isitthere == false){

            counter_arr.push(last_number);
            counter_arr.push(count);
            big_counter_arr.push(counter_arr);
            counter_arr = [];
        }
        count = 1
       
    }
    last_number= i;

}
for(n of big_counter_arr){
    if( n[0] == i){
        n[1] = n[1] + count

        isitthere= true;
            }
}
if(isitthere == false){

    counter_arr.push(i);
    counter_arr.push(count);
    big_counter_arr.push(counter_arr);
    counter_arr = [];
    }
console.log(arr);
console.log(big_counter_arr);

var biggest_number ;
var last_count = 0;
for(s of big_counter_arr){
    if(s[1] > last_count){
        biggest_number = s[0];
        last_count = s[1];
    }
    

}
console.log(biggest_number, " is repeated the most");