import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { TodoApiService } from '../todo-api.service';
import { Todo } from '../../models/Todo';

@Component({
  selector: 'app-update-todo',
  templateUrl: './update-todo.component.html',
  styleUrl: './update-todo.component.css'
})
export class UpdateTodoComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private todoService:TodoApiService){}

  todoForm:any;

  @Input('todo')
  todoDetails?:Todo;

  ngOnInit(): void {
      this.todoForm=this.formBuilder.group(
        {
          title:[this.todoDetails?.title,[Validators.required,Validators.pattern('[\\w\\s]{3,}')]],
          description:[this.todoDetails?.description]
        }
      )
  }

  addTodo(todo:Todo){
    this.todoService.addTodo(todo).subscribe(
      response=>{console.log(response);
        alert("New Task Added "+response.title)
      },
        // error=>console.log(error)
      )
      
    }

    
    
}