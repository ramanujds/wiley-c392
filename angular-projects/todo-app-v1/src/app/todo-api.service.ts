import { ErrorHandler, Injectable } from '@angular/core';
import { Todo } from '../models/Todo';
import { Observable, catchError, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ErrorHandlerService } from './error-handler.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class TodoApiService {



  private baseUrl = "http://localhost:5001/api/v1/jpa-tasks";

  constructor(private httpClient:HttpClient,private errorHandler:ErrorHandlerService,private router:Router) { }


  addTodo(todo:Todo):Observable<Todo>{
    return this.httpClient.post<Todo>(this.baseUrl,todo)
  }

  fetchTodos():Observable<Array<Todo>>{
    return this.httpClient.get<Array<Todo>>(this.baseUrl)
    .pipe(
      catchError(
        err=>{
          console.log('Error!!!');
          this.errorHandler.errorDetails={
            code:404,
            status:'Not Found',
            message:'Unable to fetch data from server'
          };
        
          this.router.navigate(['error'])

         return throwError(()=> err)
        }
          )
          
        
      
    )
  }

  fetchTodoById(id:number):Observable<Todo>{
    return this.httpClient.get<Todo>(`${this.baseUrl}/id/${id}`)
                .pipe(
                  catchError(
                    err=>{
                      console.log('Error!!!');
                      this.errorHandler.errorDetails={
                        code:404,
                        status:'Not Found',
                        message:'Unable to find ToDo with id : '+id
                      };
                    
                      this.router.navigate(['error'])

                     return throwError(()=> err)
                    }
                      )
                      
                    
                  
                )
    ;
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
