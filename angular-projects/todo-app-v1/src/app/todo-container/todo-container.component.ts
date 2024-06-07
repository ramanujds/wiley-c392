import { Component, OnInit } from '@angular/core';
import { TodoApiService } from '../todo-api.service';
import { Todo } from '../../models/Todo';

@Component({
  selector: 'app-todo-container',
  templateUrl: './todo-container.component.html',
  styleUrl: './todo-container.component.css'
})
export class TodoContainerComponent implements OnInit {

  constructor(public todoService:TodoApiService){ }
  

  todos?:Array<Todo>;

  ngOnInit(): void {
      this.todoService.fetchTodos()
          .subscribe(
            response => this.todos=response
          )
  }
  

}
