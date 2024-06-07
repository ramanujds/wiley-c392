import { Injectable } from '@angular/core';
import { Todo } from '../models/Todo';
import { Observable, identity, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoManagementService {

  todos:Array<Todo>=[
    {
      title:"Learn Java",
      description:"Learn Java from scratch",
      status:true
    },
    {
      title:"Learn Angular",
      description:"Learn Angular from scratch",
      status:false
    },
    {
      title:"Learn React",
      description:"Learn React from scratch",
      status:false
    },
    {
      title:"Learn Python",
      description:"Learn Python from scratch",
      status:false
    },
    {
      title:"Learn Spring Boot",
      description:"Learn Spring Boot from scratch",
      status:false
    }
  ];

  addTodo(todo:Todo){
    this.todos.push(todo)
  }

  removeTodo(title:string){
    const index = this.todos.findIndex(todo=>todo.title===title)
    if(index!=-1){
      this.todos.splice(index,1)
    }
  }

  checkTodoByTitle(title:string){
    return of(this.todos.some(todo=>todo.title===title))

  }

  constructor() { }
}
