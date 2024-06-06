import { Component, Input } from '@angular/core';
import { Todo } from '../../models/Todo';
import { TodoManagementService } from '../todo-management.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrl: './todo.component.css'
})
export class TodoComponent {

  @Input("todo")
  todo?:Todo;

  constructor(private todoService:TodoManagementService){}

  markAsCompleted(){
    if(this.todo)
      this.todo.status=true;
  }

  deleteTodo(title?:string){
    if(title && confirm("Sure to delete : "+this.todo?.title+"?"))
      this.todoService.removeTodo(title)
  }

}
