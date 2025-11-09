let tasks = []

let task = {
    title : '',
    iscomplete : false
}

function addTask(title){
    let temptask = {
        title : title,
        iscomplete : false
    }
    temptask.title = title
    console.log(temptask)
    tasks.push(temptask)
}
function completeTask(title){
    for(let i = 0; i < tasks.length; i++){
        if(tasks[i].title == title){
            let temptask = {
                title : title,
                iscomplete : false
            }
            temptask.iscomplete = true
            tasks[i] =  temptask
            console.log(temptask)

            break
        }
         
    }
}
function displayTasks(){
    for( t of tasks){
        if(t){
            console.log(t)

        }
    }
}

let stop = false
let answer
const prompt = require('prompt-sync')();
while(stop == false){
    console.log('What do you wish to do?')
    console.log('type "exit" to exit the program')
    console.log('type "addTask" to add a task')
    console.log('type "completeTask" to complete a task')
    console.log('type "displayTask" to view')
    answer = prompt(' - ')
    if(answer.toLowerCase() == 'exit'){
        break
    }else if( answer.toLowerCase() == 'addtask'){
        console.log('what should the task be named as? ')
        answer = prompt(' - ')
        addTask(answer)
    }else if(answer.toLowerCase() == 'completetask'){
        console.log('which task to complete ?')
        answer = prompt(' - ')
        completeTask(answer)
    }else if(answer.toLowerCase() == 'displaytask'){
        displayTasks()
    }
}
