import { Component, OnInit } from '@angular/core';
import { Todo } from '../../models/Todo';
import { ActivatedRoute } from '@angular/router';
import { TodoApiService } from '../todo-api.service';

@Component({
  selector: 'app-view-todo',
  templateUrl: './view-todo.component.html',
  styleUrl: './view-todo.component.css'
})
export class ViewTodoComponent implements OnInit {

todo?:Todo;
id?:number;

constructor(private router:ActivatedRoute, private todoService:TodoApiService){}

ngOnInit(): void {
    this.router.params.subscribe(
      value => {
        const id = value['id']
        if(id){
            this.todoService.fetchTodoById(id).subscribe(
              response=>this.todo=response
            )
        }
      }
    )
}

}
