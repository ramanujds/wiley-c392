import { Injectable } from '@angular/core';
import { Todo } from '../models/Todo';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TodoApiService {

  private baseUrl = "http://localhost:9090/api/v1/jpa-tasks";

  constructor(private httpClient:HttpClient) { }


  addTodo(todo:Todo):Observable<Todo>{
    return this.httpClient.post<Todo>(this.baseUrl,todo)
  }

  fetchTodos():Observable<Array<Todo>>{
    return this.httpClient.get<Array<Todo>>(this.baseUrl);
  }

  fetchTodoById(id:number):Observable<Todo>{
    return this.httpClient.get<Todo>(`${this.baseUrl}/id/${id}`);
  }


  fetchTodoByTitle(title:string):Observable<Todo>{
    return this.httpClient.get<Todo>(`${this.baseUrl}/title/${title}`);
  }

  removeTodo(id:number){
   return this.httpClient.delete(`${this.baseUrl}/${id}`);
  }

  updateTodo(id:number,todo:Todo):Observable<Todo>{
    return this.httpClient.put<Todo>(`${this.baseUrl}/${id}`,todo)
  }


}
