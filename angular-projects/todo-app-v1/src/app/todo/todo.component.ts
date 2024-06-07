import { Component, Input } from '@angular/core';
import { Todo } from '../../models/Todo';
import { TodoManagementService } from '../todo-management.service';
import { TodoApiService } from '../todo-api.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrl: './todo.component.css'
})
export class TodoComponent {

  @Input("todo")
  todo?:Todo;

  constructor(private todoService:TodoApiService){}

  markAsCompleted(){
    if(this.todo){
      this.todo.status=true;
      this.todoService.updateTodo(this.todo.id,this.todo)
          .subscribe(response=>console.log(response))
    }

  }

  deleteTodo(){
    if(this.todo && confirm(`Sure to delete : ${this.todo.id} : ${this.todo.title}?`))
      this.todoService.removeTodo(this.todo.id)
          .subscribe((response)=>{
            alert(`${this.todo?.title} Removed`)
            this.todo=undefined
        })
  }

}
