import { Component, Input } from '@angular/core';
import { Todo } from '../../models/Todo';

@Component({
  selector: 'app-todo-form',
  templateUrl: './todo-form.component.html',
  styleUrl: './todo-form.component.css'
})
export class TodoFormComponent {

  // title?:string;



  @Input("todos")
  todos?:Array<Todo>

  // setTitle(title:string){
  //   this.title=title;
  // }

  addTodo(todo:Todo){
     todo.status=false;
     this.todos?.push(todo)
     
  }

}
