const prompt = require('prompt-sync')({ sigint: true }); 
var sentence = prompt("enter - ");
var clean_sentence = []
var correctletters = "qwertyuiopasdfghjklzxcvbnm "
for(l of sentence){
    if(correctletters.includes(l.toLowerCase())){
        clean_sentence += l;
    }
}

var arr = clean_sentence.split(" ")

var counter_arr = [];
var big_counter_arr = [];
var count = 1;
var last_word ;
for(i of arr){
    i = i.toLowerCase();
    if(i == last_word){
        count= count + 1;

    }else{
        var isitthere = false;
        for(n of big_counter_arr){
            if( n[0] == last_word){
                n[1] = n[1] + count

                isitthere= true;
            }
        }
        if(isitthere == false){

            counter_arr.push(last_word);
            counter_arr.push(count);
            big_counter_arr.push(counter_arr);
            counter_arr = [];
        }
        count = 1
       
    }
    last_word= i;

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



for (var j = 0 ; j < big_counter_arr.length; j++){
    if(big_counter_arr[j][0] == undefined || big_counter_arr[j][0] == ''){
        big_counter_arr.splice(j,1);
    }
}
var most_repeated_word ;
var last_count = 0;
for(s of big_counter_arr){
    
    if(s[1] > last_count){
        most_repeated_word = s[0];
        last_count = s[1];
    }
    

}
console.log(big_counter_arr)

console.log(most_repeated_word, " is repeated the most");