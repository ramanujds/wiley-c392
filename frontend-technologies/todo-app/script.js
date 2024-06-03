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
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin':'*'
        },
        body:JSON.stringify(task)
    }).then(()=> alert('Task Added Successfully'))
    .catch(error => console.error(error))

   
    return false;

}