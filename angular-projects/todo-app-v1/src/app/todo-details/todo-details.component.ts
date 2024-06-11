import { Component, Input } from '@angular/core';
import { Todo } from '../../models/Todo';
import { TodoApiService } from '../todo-api.service';

@Component({
  selector: 'app-todo-details',
  templateUrl: './todo-details.component.html',
  styleUrl: './todo-details.component.css'
})
export class TodoDetailsComponent {

  @Input("todo")
  todo?:Todo;

  showUpdateForm=false;

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

  toggleShowUpdateForm(){
    this.showUpdateForm=!this.showUpdateForm
  }

}
