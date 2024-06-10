import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TodoContainerComponent } from './todo-container/todo-container.component';
import { TodoFormReactiveComponent } from './todo-form-reactive/todo-form-reactive.component';
import { TodoFormComponent } from './todo-form/todo-form.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { ViewTodoComponent } from './view-todo/view-todo.component';

const routes: Routes = [
  {
    path:'',component:HomeComponentComponent, pathMatch:'full'
  },
  {
    path:'add-todo-r',component:TodoFormReactiveComponent, pathMatch:'full'
  },
 {
  path:'add-todo',component:TodoFormComponent, pathMatch:'full'
 },
 {
  path:'view-todos',component:TodoContainerComponent, pathMatch:'full',
  // children:[
  //   {path:':id',component:ViewTodoComponent,pathMatch:'full'}
  // ]
 },
 {
  path:'view-todos/:id',component:ViewTodoComponent,pathMatch:'full'
 },
 {
  path:'error', component:ErrorComponent,pathMatch:'full'
 },
 {
  path:'**',redirectTo:'/error',pathMatch:'prefix'
 }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

