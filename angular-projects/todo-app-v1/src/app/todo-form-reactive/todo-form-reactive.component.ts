import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { todoValidator } from '../../util/TodoValidator';
import { TodoManagementService } from '../todo-management.service';

@Component({
  selector: 'app-todo-form-reactive',
  templateUrl: './todo-form-reactive.component.html',
  styleUrl: './todo-form-reactive.component.css'
})
export class TodoFormReactiveComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,private todoService:TodoManagementService){}

  todoForm:any;

  ngOnInit(): void {
      this.todoForm=this.formBuilder.group(
        {
          title:['',[Validators.required,Validators.pattern('[\\w\\s]{3,}')],todoValidator(this.todoService)],
          description:[''],
          deadline:this.formBuilder.group({
            month:[''],
            year:['']
          }
          )
        }
      )
  }

  addTodo(todo:any){
      this.todoService.addTodo(todo)
      
  }




}
