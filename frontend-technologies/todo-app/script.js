let addTodo = function(){
    let title = document.getElementById("title").value;
    let description = document.getElementById("description").value;
    let statuses = document.getElementsByName("status");
    let status=false;
    for(let inputValue of statuses){
        if(inputValue.checked){
            status=inputValue.value === 'done'? true: false;
        }
    }

    let task = {title,description,status}

    console.log(task)

    fetch('http://localhost:9090/api/v1/jpa-tasks',{
        method:'POST',
        headers:{
            'Content-Type': 'application/json'
        },
        body:JSON.stringify(task)
    }).then(()=>{ alert('Task Added Successfully')
        fetchTodos()
    })
    .catch(error => console.error(error))


    // ...
    return false;

}

let fetchTodos = async function(){

  let response = await fetch('http://localhost:9090/api/v1/jpa-tasks');

    

    let todos = await response.json();
    updateList(todos);

}

let updateList = function(todos){
    let list = document.getElementById('todo-list');
    list.innerHTML='';

    for(let todo of todos){
        list.innerHTML += `<li>${todo.title} : ${todo.description} : ${todo.status} </li>`;
    }


}